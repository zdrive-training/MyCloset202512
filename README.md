# MyCloset
自分のもっている服を管理するアプリケーションです。

## プルリクエストについて
- プルリクエストは、MyCloset202512/develop ブランチに対して行ってください。
- 作業用ブランチ名には、イシュー番号を含めてください(例: #1_create-ClothesMapper)

## クラス・インターフェース

### ドメインクラス概要
| クラス名 | 説明 |
| --- | --- |
| Brand | 衣服のブランド |
| Category | 衣服の種類(シャツ、ジャケットなど) |
| Size | 衣服のサイズ |
| Clothes | 衣服(色、ブランド、サイズ、種類など) |

### インターフェース概要

#### ClothesMapper
| メソッド | 説明 |
| --- | --- |
| selectAll() | 衣服リストの取得 |
| selectById(Integer id) | IDに基づく衣服の取得 |
| selectByCategory(Integer categoryId) | カテゴリに基づく衣服リストの取得 |
| insert(Clothes clothes) | 衣服情報の登録 |
| update(Clothes clothes) | 衣服情報の更新 |
| deleteById(Integer id) | 衣服情報の削除 |

#### ClothesService
| メソッド | 説明 |
| --- | --- |
| List<Clothes> getClothesList() | 衣服リストの取得 |
| List<Clothes> getClothesList(Integer categoryId) | カテゴリに基づく衣服リストの取得 |
| Clothes getClothes(Integer id) | IDに基づく衣服の取得 |
| void editClothesInfo(Clothes clothes) | 衣服情報の登録/編集/削除 |
