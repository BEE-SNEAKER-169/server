package com.poly.bee.serverTool;

import com.poly.bee.server.entity.Account;
import com.poly.bee.server.entity.Brand;
import com.poly.bee.server.entity.Card;
import com.poly.bee.server.entity.CardDetail;
import com.poly.bee.server.entity.Category;
import com.poly.bee.server.entity.Color;
import com.poly.bee.server.entity.CustomerInformation;
import com.poly.bee.server.entity.Material;
import com.poly.bee.server.entity.Order;
import com.poly.bee.server.entity.OrderDetail;
import com.poly.bee.server.entity.OrderHistory;
import com.poly.bee.server.entity.Product;
import com.poly.bee.server.entity.ProductDetail;
import com.poly.bee.server.entity.Promotion;
import com.poly.bee.server.entity.Role;
import com.poly.bee.server.entity.ShoesCollar;
import com.poly.bee.server.entity.Size;
import com.poly.bee.server.entity.SoleHeight;
import com.poly.bee.server.entity.Transaction;
import com.poly.bee.server.infrastructure.constant.OrderDetailStatus;
import com.poly.bee.server.infrastructure.constant.OrderStatus;
import com.poly.bee.server.infrastructure.constant.ProductStatus;
import com.poly.bee.server.infrastructure.constant.PromotionStatus;
import com.poly.bee.server.infrastructure.constant.PromotionType;
import com.poly.bee.server.infrastructure.constant.TransactionType;
import com.poly.bee.server.repository.AccountRepository;
import com.poly.bee.server.repository.BrandRepository;
import com.poly.bee.server.repository.CardDetailRepository;
import com.poly.bee.server.repository.CardRepository;
import com.poly.bee.server.repository.CategoryRepository;
import com.poly.bee.server.repository.ColorRepository;
import com.poly.bee.server.repository.CustomerInformationRepository;
import com.poly.bee.server.repository.MaterialRepository;
import com.poly.bee.server.repository.OrderDetailRepository;
import com.poly.bee.server.repository.OrderHistoryRepository;
import com.poly.bee.server.repository.OrderRepository;
import com.poly.bee.server.repository.ProductDetailRepository;
import com.poly.bee.server.repository.ProductRepository;
import com.poly.bee.server.repository.PromotionRepository;
import com.poly.bee.server.repository.RoleRepository;
import com.poly.bee.server.repository.ShoesCollarRepository;
import com.poly.bee.server.repository.SizeRepository;
import com.poly.bee.server.repository.SoleHeightRepository;
import com.poly.bee.server.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableJpaRepositories(
        basePackages = "com.poly.bee.server.repository"
)
public class DBGenerator implements CommandLineRunner {

    private final boolean IS_RELEASE = false;

    private Long convertLong(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return date.toEpochDay();
    }

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private MaterialRepository materialRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private ShoesCollarRepository shoesCollarRepository;

    @Autowired
    private SoleHeightRepository soleHeightRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductDetailRepository productDetailRepository;

    @Autowired
    private CardDetailRepository cardDetailRepository;

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderHistoryRepository orderHistoryRepository;

    @Autowired
    private CustomerInformationRepository customerInformationRepository;

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category = new Category();
        category.setCode("CA0001");
        category.setName("Thời trang");
        category.setId(categoryRepository.save(category).getId());

        Category category1 = new Category();
        category1.setCode("CA0002");
        category1.setName("Chạy bộ");
        category1.setId(categoryRepository.save(category1).getId());

        Category category2 = new Category();
        category2.setCode("CA0003");
        category2.setName("Bóng rổ");
        category2.setId(categoryRepository.save(category2).getId());

        Category category3 = new Category();
        category3.setCode("CA0004");
        category3.setName("Bóng đá");
        category3.setId(categoryRepository.save(category3).getId());

        categoryRepository.save(category);
        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);

        Brand brand = new Brand();
        brand.setCode("BR0001");
        brand.setName("Adidas");
        brand.setId(brandRepository.save(brand).getId());

        Brand brand1 = new Brand();
        brand1.setCode("BR0002");
        brand1.setName("Nike");
        brand1.setId(brandRepository.save(brand1).getId());

        Brand brand2 = new Brand();
        brand2.setCode("BR0003");
        brand2.setName("Converse");
        brand2.setId(brandRepository.save(brand2).getId());

        Brand brand3 = new Brand();
        brand3.setCode("BR0004");
        brand3.setName("Puma");
        brand3.setId(brandRepository.save(brand3).getId());

        Brand brand4 = new Brand();
        brand4.setCode("BR0005");
        brand4.setName("Vans");
        brand4.setId(brandRepository.save(brand4).getId());

        brandRepository.save(brand);
        brandRepository.save(brand1);
        brandRepository.save(brand2);
        brandRepository.save(brand3);
        brandRepository.save(brand4);

        Color color = new Color();
        color.setCode("CL0001");
        color.setName("Trắng");
        color.setId(colorRepository.save(color).getId());

        Color color1 = new Color();
        color1.setCode("CL0002");
        color1.setName("Đen");
        color1.setId(colorRepository.save(color1).getId());

        Color color2 = new Color();
        color2.setCode("CL0003");
        color2.setName("Xanh lá cây");
        color2.setId(colorRepository.save(color2).getId());

        Color color3 = new Color();
        color3.setCode("CL0004");
        color3.setName("Đỏ");
        color3.setId(colorRepository.save(color3).getId());

        Color color4 = new Color();
        color4.setCode("CL0005");
        color4.setName("Xám");
        color4.setId(colorRepository.save(color4).getId());

        colorRepository.save(color);
        colorRepository.save(color1);
        colorRepository.save(color2);
        colorRepository.save(color3);
        colorRepository.save(color4);

        Material material = new Material();
        material.setCode("MA0001");
        material.setName("Vải canvas");
        material.setId(materialRepository.save(material).getId());

        Material material1 = new Material();
        material1.setCode("MA0002");
        material1.setName("Da PU");
        material1.setId(materialRepository.save(material1).getId());

        Material material2 = new Material();
        material2.setCode("MA0003");
        material2.setName("Da nhân tạo – Artificial Leather");
        material2.setId(materialRepository.save(material2).getId());

        Material material3 = new Material();
        material3.setCode("MA0004");
        material3.setName("Vải knit");
        material3.setId(materialRepository.save(material3).getId());

        Material material4 = new Material();
        material4.setCode("MA0005");
        material4.setName("Vải mesh");
        material4.setId(materialRepository.save(material4).getId());

        materialRepository.save(material);
        materialRepository.save(material1);
        materialRepository.save(material2);
        materialRepository.save(material3);
        materialRepository.save(material4);

        Size size = new Size();
        size.setCode("SI0001");
        size.setName("38");
        size.setId(sizeRepository.save(size).getId());

        Size size1 = new Size();
        size1.setCode("SI0002");
        size1.setName("39");
        size1.setId(sizeRepository.save(size1).getId());

        Size size2 = new Size();
        size2.setCode("SI0003");
        size2.setName("40");
        size2.setId(sizeRepository.save(size2).getId());

        Size size3 = new Size();
        size3.setCode("SI0004");
        size3.setName("41");
        size3.setId(sizeRepository.save(size3).getId());

        Size size4 = new Size();
        size4.setCode("SI0005");
        size4.setName("42");
        size4.setId(sizeRepository.save(size4).getId());

        sizeRepository.save(size);
        sizeRepository.save(size1);
        sizeRepository.save(size2);
        sizeRepository.save(size3);
        sizeRepository.save(size4);

        ShoesCollar shoesCollar = new ShoesCollar();
        shoesCollar.setCode("SH0001");
        shoesCollar.setName("Low");
        shoesCollar.setId(shoesCollarRepository.save(shoesCollar).getId());

        ShoesCollar shoesCollar1 = new ShoesCollar();
        shoesCollar1.setCode("SH0002");
        shoesCollar1.setName("Mid");
        shoesCollar1.setId(shoesCollarRepository.save(shoesCollar1).getId());

        ShoesCollar shoesCollar2 = new ShoesCollar();
        shoesCollar2.setCode("SH0003");
        shoesCollar2.setName("High");
        shoesCollar2.setId(shoesCollarRepository.save(shoesCollar2).getId());

        shoesCollarRepository.save(shoesCollar);
        shoesCollarRepository.save(shoesCollar1);
        shoesCollarRepository.save(shoesCollar2);

        SoleHeight soleHeight = new SoleHeight();
        soleHeight.setCode("SL0001");
        soleHeight.setCode("4cm");

        SoleHeight soleHeight1 = new SoleHeight();
        soleHeight1.setCode("SL0002");
        soleHeight1.setCode("3 cm");
        soleHeight1.setId(soleHeightRepository.save(soleHeight1).getId());

        SoleHeight soleHeight2 = new SoleHeight();
        soleHeight2.setCode("SL0003");
        soleHeight2.setCode("5 cm");
        soleHeight2.setId(soleHeightRepository.save(soleHeight2).getId());

        SoleHeight soleHeight3 = new SoleHeight();
        soleHeight3.setCode("SL0004");
        soleHeight3.setCode("6 cm");
        soleHeight3.setId(soleHeightRepository.save(soleHeight3).getId());

        SoleHeight soleHeight4 = new SoleHeight();
        soleHeight4.setCode("SL0005");
        soleHeight4.setCode("8 cm");
        soleHeight4.setId(soleHeightRepository.save(soleHeight4).getId());

        soleHeightRepository.save(soleHeight);
        soleHeightRepository.save(soleHeight1);
        soleHeightRepository.save(soleHeight2);
        soleHeightRepository.save(soleHeight3);
        soleHeightRepository.save(soleHeight4);

        Product product = new Product();
        product.setCode("PR0001");
        product.setName("Nike Air Force 1");
        product.setDescription("50 năm sau khi thể loại này ra đời, hip-hop vẫn có sức ảnh hưởng đến thời trang đường phố. Giày Nike luôn là một phần không thể thiếu của nền văn hóa này—cả ảnh hưởng và bị ảnh hưởng bởi các nhạc sĩ, nghệ sĩ và người hâm mộ mang tính biểu tượng. Kỷ niệm nửa thế kỷ nghệ thuật và văn hóa với các bản ghi bạch kim và vàng trên đế của bạn và các chi tiết màu xám kim loại ở trên để phù hợp. Ren lên và có được quay.");
        product.setId(productRepository.save(product).getId());

        Product product1 = new Product();
        product1.setCode("PR0002");
        product1.setName("Air Jordan 1");
        product1.setDescription("Lấy cảm hứng từ AJ1 nguyên bản, phiên bản trung cấp này duy trì vẻ ngoài mang tính biểu tượng mà bạn yêu thích trong khi các màu sắc lựa chọn và chất liệu da sắc nét mang đến cho nó một bản sắc riêng biệt.");
        product1.setId(productRepository.save(product1).getId());

        Product product2 = new Product();
        product2.setCode("PR0003");
        product2.setName("Ultraboots");
        product2.setDescription("Khi đi dạo trong công viên cũng như chạy bộ cuối tuần cùng bạn bè, đôi giày adidas Ultraboost 1.0 này sẽ giúp bạn luôn thoải mái. Thân giày adidas PRIMEKNIT ôm chân nhẹ nhàng, đồng thời đệm BOOST ở đế giữa nâng niu từ bước chân đầu tiên cho tới tận cây số cuối cùng. Đế ngoài Stretchweb linh hoạt tự nhiên cho sải bước tràn đầy năng lượng, cùng chất liệu cao su Continental™ Rubber tạo độ bám cần thiết để bạn luôn vững bước.");
        product2.setId(productRepository.save(product2).getId());

        Product product3 = new Product();
        product3.setCode("PR0004");
        product3.setName("Vans Old Skool");
        product3.setDescription("Lần đầu tiên được ra mắt vào năm 1977, Vans Old Skool đã đứng đầu danh sách bán chạy nhất kể từ đó nhờ kiểu dáng cổ điển và thiết kế dễ nhận biết ngay lập tức. Phiên bản màu đen và xanh nước biển này có kiểu dáng Cổ điển và mang đến một điểm nhấn, cho phép ánh sáng lung linh của màu đen và xanh nước biển mang lại sức sống mới cho chiếc giày. Mũi giày được gia cố chắc chắn, màu đệm hỗ trợ và đế ngoài bằng cao su hình bánh quế đặc trưng đảm nhận khía cạnh thực tế, trong khi màu sắc tự nói lên điều đó. Old Skool Primary là sự lựa chọn rõ ràng cho bất kỳ ai muốn thu hẹp khoảng cách giữa biểu tượng và sáng tạo.");
        product3.setId(productRepository.save(product3).getId());

        Product product4 = new Product();
        product4.setCode("PR0005");
        product4.setName("Chuck Taylor All Star Classic");
        product4.setDescription("Nó bắt đầu khi chúng tôi dùng kéo cắt đôi High Top Chucks ban đầu của mình, biến chúng thành giày bóng rổ cổ thấp. Sau đó, giày thể thao rời khỏi tòa án trên đường phố, củng cố vị thế của nó như một biểu tượng hàng ngày. Điều gì tiếp theo cho Low Top Chucks là tùy thuộc vào bạn. Chúng linh hoạt, cổ điển và hoàn toàn là của bạn để mặc theo bất kỳ cách nào bạn muốn, bất cứ nơi nào bạn muốn, bất cứ lúc nào bạn muốn. Chúng tôi chỉ làm giày. Bạn tạo ra những câu chuyện.");
        product4.setId(productRepository.save(product4).getId());

        productRepository.save(product);
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);

        ProductDetail productDetail = new ProductDetail();
        productDetail.setProduct(product);
        productDetail.setBrand(brand1);
        productDetail.setCategory(category);
        productDetail.setMaterial(material);
        productDetail.setColor(color);
        productDetail.setShoesCollar(shoesCollar);
        productDetail.setSoleHeight(soleHeight1);
        productDetail.setSize(size2);
        productDetail.setPrice(new BigDecimal(3400000));
        productDetail.setQuantity(3);
        productDetail.setSku("123456");
        productDetail.setStatus(ProductStatus.HOAT_DONG);

        ProductDetail productDetail1 = new ProductDetail();
        productDetail1.setProduct(product1);
        productDetail1.setBrand(brand1);
        productDetail1.setCategory(category);
        productDetail1.setMaterial(material1);
        productDetail1.setColor(color);
        productDetail1.setShoesCollar(shoesCollar2);
        productDetail1.setSoleHeight(soleHeight);
        productDetail1.setSize(size3);
        productDetail1.setPrice(new BigDecimal(4500000));
        productDetail1.setQuantity(5);
        productDetail1.setSku("987654");
        productDetail1.setStatus(ProductStatus.HOAT_DONG);

        ProductDetail productDetail2 = new ProductDetail();
        productDetail2.setProduct(product2);
        productDetail2.setBrand(brand);
        productDetail2.setCategory(category1);
        productDetail2.setMaterial(material3);
        productDetail2.setColor(color1);
        productDetail2.setShoesCollar(shoesCollar);
        productDetail2.setSoleHeight(soleHeight2);
        productDetail2.setSize(size);
        productDetail2.setPrice(new BigDecimal(2400000));
        productDetail2.setQuantity(4);
        productDetail2.setSku("135790");
        productDetail2.setStatus(ProductStatus.HOAT_DONG);

        ProductDetail productDetail3 = new ProductDetail();
        productDetail3.setProduct(product3);
        productDetail3.setBrand(brand4);
        productDetail3.setCategory(category);
        productDetail3.setMaterial(material4);
        productDetail3.setColor(color2);
        productDetail3.setShoesCollar(shoesCollar);
        productDetail3.setSoleHeight(soleHeight2);
        productDetail3.setSize(size);
        productDetail3.setPrice(new BigDecimal(3000000));
        productDetail3.setQuantity(6);
        productDetail3.setSku("246810");
        productDetail3.setStatus(ProductStatus.HOAT_DONG);

        ProductDetail productDetail4 = new ProductDetail();
        productDetail4.setProduct(product4);
        productDetail4.setBrand(brand2);
        productDetail4.setCategory(category);
        productDetail4.setMaterial(material);
        productDetail4.setColor(color4);
        productDetail4.setShoesCollar(shoesCollar2);
        productDetail4.setSoleHeight(soleHeight3);
        productDetail4.setSize(size4);
        productDetail4.setPrice(new BigDecimal(3800000));
        productDetail4.setQuantity(3);
        productDetail4.setSku("145732");
        productDetail4.setStatus(ProductStatus.HOAT_DONG);

        productDetailRepository.save(productDetail);
        productDetailRepository.save(productDetail1);
        productDetailRepository.save(productDetail2);
        productDetailRepository.save(productDetail3);
        productDetailRepository.save(productDetail4);

        Role role = new Role();
        role.setCode("RL0001");
        role.setName("Quản lý");
        role.setId(roleRepository.save(role).getId());

        Role role1 = new Role();
        role1.setCode("RL0002");
        role1.setName("Nhân viên");
        role1.setId(roleRepository.save(role1).getId());

        Role role2 = new Role();
        role2.setCode("RL0003");
        role2.setName("Khách hàng");
        role2.setId(roleRepository.save(role2).getId());

        roleRepository.save(role);
        roleRepository.save(role1);
        roleRepository.save(role2);

        Account account = new Account();
        account.setCode("AC0001");
        account.setName("Hùng");
        account.setBirthDate(convertLong("25/08/2003"));
        account.setRole(role);
        account.setEmail("phungviethunh@gmail.com");
        account.setPhoneNumber("0345424622");
        account.setPassword("123456");
        account.setId(accountRepository.save(account).getId());

        Account account1 = new Account();
        account1.setCode("AC0002");
        account1.setName("Huy");
        account1.setBirthDate(convertLong("29/07/2003"));
        account1.setRole(role2);
        account1.setEmail("huynqph26782@fpt.edu.vn");
        account1.setPhoneNumber("0328843156");
        account1.setPassword("123456");
        account1.setId(accountRepository.save(account1).getId());

        Account account2 = new Account();
        account2.setCode("AC0003");
        account2.setName("Hải");
        account2.setBirthDate(convertLong("29/07/2003"));
        account2.setRole(role1);
        account2.setEmail("haipxph26772@fpt.edu.vn");
        account2.setPhoneNumber("0328843156");
        account2.setPassword("123456");
        account2.setId(accountRepository.save(account2).getId());

        Account account3 = new Account();
        account3.setCode("AC0004");
        account3.setName("Ngọc Anh");
        account3.setBirthDate(convertLong("29/07/2003"));
        account3.setRole(role2);
        account3.setEmail("anhdtph25326@fpt.edu.vn");
        account3.setPhoneNumber("0328843156");
        account3.setPassword("123456");
        account3.setId(accountRepository.save(account3).getId());

        Account account4 = new Account();
        account4.setCode("AC0004");
        account4.setName("Quang Huy");
        account4.setBirthDate(convertLong("06/08/2003"));
        account4.setRole(role2);
        account4.setEmail("huyvqph25924@fpt.edu.vn");
        account4.setPhoneNumber("0981617258");
        account4.setPassword("123456");
        account4.setId(accountRepository.save(account4).getId());

        accountRepository.save(account);
        accountRepository.save(account1);
        accountRepository.save(account2);
        accountRepository.save(account3);
        accountRepository.save(account4);

        Card card = new Card();
        card.setAccount(account1);

        Card card1 = new Card();
        card1.setAccount(account3);

        cardRepository.save(card);
        cardRepository.save(card1);

        CardDetail cardDetail = new CardDetail();
        cardDetail.setCard(card);
        cardDetail.setProductDetail(productDetail);
        cardDetail.setQuantity(1);
        cardDetail.setId(cardDetailRepository.save(cardDetail).getId());

        CardDetail cardDetail1 = new CardDetail();
        cardDetail1.setCard(card1);
        cardDetail1.setProductDetail(productDetail1);
        cardDetail1.setQuantity(2);
        cardDetail1.setId(cardDetailRepository.save(cardDetail1).getId());

        cardDetailRepository.save(cardDetail);
        cardDetailRepository.save(cardDetail1);

        Promotion promotion = new Promotion();
        promotion.setCode("PM0001");
        promotion.setName("Chào đón mùa hè");
        promotion.setStartTime(convertLong("01/06/2003"));
        promotion.setEndTime(convertLong("01/07/2023"));
        promotion.setDescription("Tưng bừng chào đón một mùa hè náo nhiệt");
        promotion.setValue(0.2);
        promotion.setStatus(PromotionStatus.HOAT_DONG);
        promotion.setType(PromotionType.THEO_TIEN_MAT);
        promotion.setId(promotionRepository.save(promotion).getId());

        Promotion promotion1 = new Promotion();
        promotion1.setCode("PM0002");
        promotion1.setName("Tưng bừng khai chương");
        promotion1.setStartTime(convertLong("05/05/2003"));
        promotion1.setEndTime(convertLong("10/05/2023"));
        promotion1.setDescription("Tưng bừng khai chương cửa hàng");
        promotion1.setStatus(PromotionStatus.NGUNG_HOAT_DONG);
        promotion1.setType(PromotionType.THEO_TIEN_MAT);
        promotion1.setValue(0.5);
        promotion1.setId(promotionRepository.save(promotion1).getId());

        promotionRepository.save(promotion);
        promotionRepository.save(promotion1);

        CustomerInformation customerInformation = new CustomerInformation();
        customerInformation.setName("Vũ Quang Huy");
        customerInformation.setAddress("Tu Hoàng, Xuân Phương, Namm Từ Liêm, Hà Nội");
        customerInformation.setId(customerInformationRepository.save(customerInformation).getId());

        CustomerInformation customerInformation1 = new CustomerInformation();
        customerInformation1.setName("Đặng Ngọc Anh");
        customerInformation1.setAddress("Hòa Lạc, Hà Nội");
        customerInformation1.setId(customerInformationRepository.save(customerInformation1).getId());

        customerInformationRepository.save(customerInformation);
        customerInformationRepository.save(customerInformation1);

        Order order = new Order();
        order.setCode("HD0001");
        order.setAddress("Tu Hoàng, Xuân Phương, Namm Từ Liêm, Hà Nội");
        order.setPhoneNumber("0981617258");
        order.setCustomer(account4);
        order.setEmployee(account1);
        order.setCustomerName("Vũ Quang Huy");
        order.setConfirmationDate(convertLong("01/06/2003"));
        order.setDeliveryDate(convertLong("01/06/2003"));
        order.setReceivedDate(convertLong("05/06/2003"));
        order.setCompletionDate(convertLong("05/06/2003"));
        order.setMoneyShip(new BigDecimal(30000));
        order.setTotalMoney(new BigDecimal(3430000));
        order.setStatus(OrderStatus.DA_HOAN_THANH);
        order.setCustomerInformation(customerInformation);
        order.setId(orderRepository.save(order).getId());

        Order order1 = new Order();
        order1.setCode("HD0002");
        order1.setAddress("Hòa Lạc, Hà Nội");
        order1.setPhoneNumber("0328843156");
        order1.setCustomer(account3);
        order1.setEmployee(account1);
        order1.setCustomerName("Đặng Ngọc Anh");
        order1.setConfirmationDate(convertLong("01/06/2003"));
        order1.setDeliveryDate(convertLong("01/06/2003"));
        order1.setReceivedDate(convertLong("05/06/2003"));
        order1.setCompletionDate(convertLong("05/06/2003"));
        order1.setMoneyShip(new BigDecimal(50000));
        order1.setTotalMoney(new BigDecimal(3050000));
        order1.setStatus(OrderStatus.DA_HOAN_THANH);
        order1.setCustomerInformation(customerInformation1);
        order1.setId(orderRepository.save(order1).getId());

        orderRepository.save(order);
        orderRepository.save(order1);

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setQuantity(1);
        orderDetail.setPrice(new BigDecimal(3400000));
        orderDetail.setProductDetail(productDetail);
        orderDetail.setOrder(order);
        orderDetail.setStatus(OrderDetailStatus.DA_BAN);

        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setQuantity(1);
        orderDetail1.setPrice(new BigDecimal(3000000));
        orderDetail1.setProductDetail(productDetail3);
        orderDetail1.setOrder(order1);
        orderDetail1.setStatus(OrderDetailStatus.DA_BAN);

        orderDetailRepository.save(orderDetail);
        orderDetailRepository.save(orderDetail1);

        OrderHistory orderHistory = new OrderHistory();
        orderHistory.setActionDescription("Mua hàng");
        orderHistory.setOrder(order);
        orderHistory.setStatus(OrderStatus.DA_HOAN_THANH);

        OrderHistory orderHistory1 = new OrderHistory();
        orderHistory1.setActionDescription("Mua hàng");
        orderHistory1.setOrder(order1);
        orderHistory1.setStatus(OrderStatus.DA_HOAN_THANH);

        orderHistoryRepository.save(orderHistory);
        orderHistoryRepository.save(orderHistory1);

        Transaction transaction = new Transaction();
        transaction.setTotalMoney(new BigDecimal(3400000));
        transaction.setNote("Khách chuyển đủ tiền");
        transaction.setOrder(order);
        transaction.setType(TransactionType.CHUYEN_KHOAN);

        Transaction transaction1 = new Transaction();
        transaction1.setTotalMoney(new BigDecimal(3000000));
        transaction1.setNote("Khách đưa đủ tiền");
        transaction1.setOrder(order1);
        transaction1.setType(TransactionType.TIEN_MAT);

        transactionRepository.save(transaction);
        transactionRepository.save(transaction1);

    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DBGenerator.class);
        ctx.close();
    }

}
