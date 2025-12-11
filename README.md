# MyCloset
自分のもっている服を管理するアプリケーションです。

## インターフェース概要

### ClothesMapper
| メソッド | 説明 |
| --- | --- |
| selectAll() | 衣服リストの取得 |
| selectById(Integer id) | IDに基づく衣服の取得 |
| selectByCategory(Integer categoryId) | カテゴリに基づく衣服リストの取得 |
| insert(Clothes clothes) | 衣服情報の登録 |
| update(Clothes clothes) | 衣服情報の更新 |
| deleteById(Integer id) | 衣服情報の削除 |

### ClothesService
| メソッド | 説明 |
| --- | --- |
| List<Clothes> getClothesList() | 衣服リストの取得 |
| List<Clothes> getClothesList(Integer categoryId) | カテゴリに基づく衣服リストの取得 |
| Clothes getClothes(Integer id) | IDに基づく衣服の取得 |
| void editClothesInfo(Clothes clothes) | 衣服情報の登録/編集/削除 |
