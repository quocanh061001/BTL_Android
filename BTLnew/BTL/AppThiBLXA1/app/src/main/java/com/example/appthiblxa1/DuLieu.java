package com.example.appthiblxa1;

import com.example.appthiblxa1.Model.Anwser;
import com.example.appthiblxa1.Model.ItemBienBao;
import com.example.appthiblxa1.Model.Question;
import com.example.appthiblxa1.Model.XuPhat;
import com.example.appthiblxa1.SQLite.BienBaoDAO;
import com.example.appthiblxa1.SQLite.CauHoiDAO;
import com.example.appthiblxa1.SQLite.XuphatDao;

public class DuLieu {
    private CauHoiDAO cauHoiDAO;
    private BienBaoDAO bienBaoDAO;
    private XuphatDao xuphatDao;
    public DuLieu(CauHoiDAO cauHoiDAO){

        this.cauHoiDAO=cauHoiDAO;
        addCauHoi();
        addDapAn();
        addDeThi();

        addDeThiCauHoi();
    }
    public DuLieu(BienBaoDAO bienBaoDAO){
        this.bienBaoDAO=bienBaoDAO;
        addBienBao();
    }
    public DuLieu(XuphatDao xuphat){
        this.xuphatDao=xuphat;
        addXuphat();
    }
    public void addXuphat(){
        xuphatDao.AddMucXuPhat(new XuPhat(1, "xi nhan khi chuyển làn","100.000 - 200.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(2, "xi nhan khi chuyển hướng","400.000 - 600.000 đồng"));

        xuphatDao.AddMucXuPhat(new XuPhat(3, "chở 2 người","200.000 - 300.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(4, "chở 3 người","400.000 - 600.000 đồng\n" +
                "\n" +
                "(tước Bằng từ 01 - 03 tháng)"));
        xuphatDao.AddMucXuPhat(new XuPhat(5, "Không xi nhan, còi khi vượt trước","100.000 - 200.000 đồng"));

        xuphatDao.AddMucXuPhat(new XuPhat(6, "Vượt đèn đỏ, đèn vàng","600.000 - 01 triệu đồng\n" +
                "\n" +
                "(tước Bằng từ 01 - 03 tháng)"));
        xuphatDao.AddMucXuPhat(new XuPhat(7, "Sai làn","400.000 - 600.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(8, "Đi ngược chiều","01 - 02 triệu đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(9, "Đi vào đường cấm","400.000 - 600.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(10, "Không gương chiếu hậu","100.000 - 200.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(11, "Không mang Bằng","100.000 - 200.000 đồng"));

        xuphatDao.AddMucXuPhat(new XuPhat(12, "Không mang đăng ký xe","100.000 - 200.000 đồng"));
        xuphatDao.AddMucXuPhat(new XuPhat(13, "Không có đăng ký xe","300.000 - 400.000 đồng"));

    }
    public void addBienBao(){
        bienBaoDAO.insertBienBao(new ItemBienBao(101,1,"Đường cấm",R.drawable.duong_cam ));
        bienBaoDAO.insertBienBao(new ItemBienBao(102,1,"Cấm đi ngược chiều", R.drawable.cam_di_nguoc_chieu));
        bienBaoDAO.insertBienBao(new ItemBienBao(103,2,"Cấm xe ôtô và xe máy",R.drawable.cam_oto_xe_may ));
        bienBaoDAO.insertBienBao(new ItemBienBao(104,2,"Cấm dừng và dỗ xe",R.drawable.icon_bb1 ));
        bienBaoDAO.insertBienBao(new ItemBienBao(105,2,"Cấm rẻ phải",R.drawable.cam_re_phai));
        bienBaoDAO.insertBienBao(new ItemBienBao(106,3,"Cấm xe máy",R.drawable.cam_xe_dap ));
        bienBaoDAO.insertBienBao(new ItemBienBao(107,3,"Cấm xe ôtô",R.drawable.cam_oto ));
        bienBaoDAO.insertBienBao(new ItemBienBao(108,1,"Cấm xe đạp",R.drawable.cam_xe_dap ));
        bienBaoDAO.insertBienBao(new ItemBienBao(109,1,"Cấm người đi bộ",R.drawable.cam_nguoi_di_bo ));
        bienBaoDAO.insertBienBao(new ItemBienBao(111,2,"Dừng lại",R.drawable.dung_lai ));
        bienBaoDAO.insertBienBao(new ItemBienBao(112,2,"Giao nhau với dường không ưu tiên",R.drawable.giao_nhau_voi_duong_khong_uu_tien ));
    }
    public void addDeThi()
    {
        cauHoiDAO.insertDeThi(1);
    }
    public void addDeThiCauHoi(){
        cauHoiDAO.insertDeThiCauHoi(1,101);
        cauHoiDAO.insertDeThiCauHoi(1,102);
        cauHoiDAO.insertDeThiCauHoi(1,103);
        cauHoiDAO.insertDeThiCauHoi(1,104);
        cauHoiDAO.insertDeThiCauHoi(1,105);
        cauHoiDAO.insertDeThiCauHoi(1,106);
        cauHoiDAO.insertDeThiCauHoi(1,107);
        cauHoiDAO.insertDeThiCauHoi(1,108);
        cauHoiDAO.insertDeThiCauHoi(1,109);
        cauHoiDAO.insertDeThiCauHoi(1,110);
        cauHoiDAO.insertDeThiCauHoi(1,111);
        cauHoiDAO.insertDeThiCauHoi(1,112);
        cauHoiDAO.insertDeThiCauHoi(1,113);
        cauHoiDAO.insertDeThiCauHoi(1,114);
        cauHoiDAO.insertDeThiCauHoi(1,115);
        cauHoiDAO.insertDeThiCauHoi(1,116);
        cauHoiDAO.insertDeThiCauHoi(1,117);
    }
    public void addCauHoi(){
        cauHoiDAO.insertCauHoi(new Question(101, "Phần của đường bộ được sử dụng cho các phương tiện" +
                " giao thông qua lại là gì ", 0, 0));
        cauHoiDAO.insertCauHoi(new Question(102, "Phương tiện tham gia giao thông đường bộ gồm những loại nào",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(103, "Sử dụng rượu bia khi lái xe, nếu bị phát hiện thì bị xử lý như thế nào", 0, 0));
        cauHoiDAO.insertCauHoi(new Question(104, "Bạn đang lái xe phía trước có một xe cứu thương đang phát tín hiệu ưu tiên bạn có được phép vượt hay không",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(105, "Hành vi sử dụng xe mô tô để kéo, đẩy xe mô tô khác bị hết xăng đến trạm mua xăng có được phép hay không",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(106, "Bạn đang lái xe trong khu vực đô thị từ 22 giờ đến 5 giờ sáng hôm sau và cần vượt một xe khác, bạn cần báo hiệu như thế nào để đảm bảo an toàn giao thông",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(107, "Trên đoạn đường hai chiều không có giải phân cách giữa, người lái xe không được vượt xe khác trong các trường hợp nào dưới đây",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(108, "Khi điều khiển xe chạy với tốc độ dưới 60 km/h, để đảm bảo khoảng cách an toàn giữa hai xe, người lái xe phải điều khiển xe như thế nào",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(109, "Để báo hiệu cho xe phía trước biết xe mô tô của bạn muốn vượt, bạn phải có tín hiệu như thế nào dưới đây ",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(110, "Khi điều khiển xe mô tô tay ga xuống đường dốc dài, độ dốc cao, người lái xe cần thực hiện các thao tác nào dưới đây để đảm bảo an toàn",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(111, "Tay ga trên xe mô tô hai bánh có tác dụng gì trong các trường hợp dưới đây",
                0, 0));
        cauHoiDAO.insertCauHoi(new Question(112, "Biển nào cấm xe rẽ trái ",
                R.drawable.image_7, 0));
        cauHoiDAO.insertCauHoi(new Question(113, "Biển nào dưới đây các phương tiện không được phép đi vào",
                R.drawable.image_8, 0));
        cauHoiDAO.insertCauHoi(new Question(114, "Biển nào xe mô tô hai bánh không được đi vào",
                R.drawable.image_9, 0));
        cauHoiDAO.insertCauHoi(new Question(115, "Biển nào báo hiệu nguy hiểm giao nhau với đường sắt",
                R.drawable.imges_1, 0));
        cauHoiDAO.insertCauHoi(new Question(116, "Biển nào báo hiệu “Đường giao nhau” của các tuyến đường cùng cấp",
                R.drawable.image_10, 0));
        cauHoiDAO.insertCauHoi(new Question(117, "Biển nào dưới đây báo hiệu hết cấm vượt",
                R.drawable.image_11, 0));
        cauHoiDAO.insertCauHoi(new Question(201, "Xe nào được quyền đi trước trong trường hợp này",
                0, R.drawable.image_5));
        cauHoiDAO.insertCauHoi(new Question(202, "Xe tải kéo mô tô ba bánh như hình này có đúng quy tắc giao thông không",
                0, R.drawable.image_6));
        cauHoiDAO.insertCauHoi(new Question(203, "Theo hướng mũi tên, những hướng nào xe mô tô được phép đi",
                0, R.drawable.image_12));

    }
    public void addDapAn(){
        cauHoiDAO.insertDapAn(new Anwser(1, 101, "Phần mặt đường và lề đường", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(2, 101, "Phần đường xe chạy", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(3, 101, "Phần đường xe cơ giới", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(4, 102, "Phương tiện giao thông cơ giới đường bộ", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(5, 102, "Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng",
                0, false));
        cauHoiDAO.insertDapAn(new Anwser(6, 102, "Cả 2 ý trên", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(7, 103, "Chỉ bị nhắc nhở", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(8, 103, "Bị xử phạt hành chính hoặc có thể bị xử lý hình sự tùy theo mức độ vi phạm",
                1, false));
        cauHoiDAO.insertDapAn(new Anwser(9, 103, "Không bị xử lý hình sự", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(10, 104, "Không được vượt", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(11, 104, "Được vượt khi đang đi trên cầu", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(12, 104, "Được phép vượt khi đi qua nơi giao nhau có ít phương tiện cùng tham gia giao thông",
                0, false));
        cauHoiDAO.insertDapAn(new Anwser(13, 104, "Được vượt khi đảm bảo an toàn", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(14, 105, "Chỉ được kéo nếu đã nhìn thấy trạm xăng", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(15, 105, "Chỉ được thực hiện trên đường vắng phương tiện cùng tham gia giao thông", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(16, 105, "Không được phép", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(17, 106, "Phải báo hiệu bằng đèn hoặc còi", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(18, 106, "Chỉ được báo hiệu bằng còi", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(19, 106, "Phải báo hiệu bằng cả còi và đèn", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(20, 106, "Chỉ được báo hiệu bằng đèn", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(21, 107, "Xe bị vượt bất ngờ tăng tốc độ và cố tình không nhường đường", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(22, 107, "Xe bị vượt giảm tốc độ và nhường đường", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(23, 107, "Phát hiện có xe đi ngược chiều", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(24, 107, "Cả ý 1 và ý 3", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(24, 108, "Chủ động giữ khoảng cách an toàn phù hợp với xe chạy liền trước xe của mình", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(25, 108, "Đảm bảo khoảng cách an toàn theo mật độ phương tiện, tình hình giao thông thực tế", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(26, 108, "Cả ý 1 và ý 2", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(27, 109, "Ra tín hiệu bằng tay rồi cho xe vượt qua", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(28, 109, "Tăng ga mạnh để gây sự chú ý rồi cho xe vượt qua", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(29, 109, "Bạn phải có tín hiệu bằng đèn hoặc còi", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(30, 110, "Giữ tay ga ở mức độ phù hợp, sử dụng phanh trước và phanh sau để giảm tốc độ", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(31, 110, "Nhả hết tay ga, tắt động cơ, sử dụng phanh trước và phanh sau để giảm tốc độ", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(32, 110, "Sử dụng phanh trước để giảm tốc độ kết hợp với tắt chìa khóa điện của xe", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(33, 111, "Để điều khiển xe chạy về phía trước", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(34, 111, "Để điều tiết công suất động cơ qua đó điều khiển tốc độ của xe", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(35, 111, "Để điều khiển xe chạy lùi", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(36, 111, "Cả ý 1 và ý 2", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(37, 112, "Biển 1", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(38, 112, "Biển 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(39, 112, "Cả hai biển", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(40, 113, "Biển 1", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(41, 113, "Biển 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(42, 113, "Biển 1 và 2", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(43, 114, "Biển 1", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(44, 114, "Biển 2", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(45, 114, "Biển 3", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(46, 115, "Biển 1 và 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(47, 115, "Biển 1 và 3", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(48, 115, "Biển 2 và 3", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(49, 115, "Cả ba biển", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(50, 116, "Biển 1", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(51, 116, "Biển 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(52, 116, "Biển 3", 0, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(53, 117, "Biển 1", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(54, 117, "Biển 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(55, 117, "Biển 3", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(56, 117, "Biển 2 và 3", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(1001, 201, "Mô tô", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(1002, 201, "Xe cứu thương", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(1003, 202, "Đúng", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(1004, 202, "Không đúng", 1, false));
        //
        cauHoiDAO.insertDapAn(new Anwser(1005, 203, "Cả ba hướng", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(1006, 203, "Hướng 1 và 2", 0, false));
        cauHoiDAO.insertDapAn(new Anwser(1007, 203, "Hướng 1 và 3", 1, false));
        cauHoiDAO.insertDapAn(new Anwser(1008, 203, "Hướng 2 và 3", 0, false));
    }
}
