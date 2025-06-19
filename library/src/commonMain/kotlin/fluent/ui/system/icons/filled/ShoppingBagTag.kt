package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.ShoppingBagTag: ImageVector
    get() {
        if (_ShoppingBagTag != null) {
            return _ShoppingBagTag!!
        }
        _ShoppingBagTag = ImageVector.Builder(
            name = "Filled.ShoppingBagTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7f, 7f)
                verticalLineTo(5f)
                curveTo(7f, 3.343f, 8.343f, 2f, 10f, 2f)
                curveTo(10.768f, 2f, 11.469f, 2.289f, 12f, 2.764f)
                curveTo(12.531f, 2.289f, 13.232f, 2f, 14f, 2f)
                curveTo(15.657f, 2f, 17f, 3.343f, 17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(18.5f)
                curveTo(19.328f, 7f, 20f, 7.672f, 20f, 8.5f)
                verticalLineTo(12.818f)
                lineTo(19.031f, 11.864f)
                curveTo(18.468f, 11.31f, 17.709f, 10.999f, 16.919f, 11f)
                lineTo(14.5f, 11.002f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                verticalLineTo(5f)
                curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
                curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
                curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
                verticalLineTo(11.173f)
                curveTo(11.836f, 11.585f, 11f, 12.692f, 11f, 13.998f)
                verticalLineTo(16.935f)
                curveTo(11f, 17.72f, 11.309f, 18.473f, 11.859f, 19.033f)
                lineTo(14.774f, 22f)
                horizontalLineTo(8f)
                curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                horizontalLineTo(7f)
                close()
                moveTo(8.5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(11.5f)
                verticalLineTo(5f)
                curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
                curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
                close()
                moveTo(12.572f, 18.332f)
                lineTo(16.573f, 22.404f)
                curveTo(17.354f, 23.199f, 18.637f, 23.205f, 19.425f, 22.416f)
                lineTo(22.418f, 19.42f)
                curveTo(23.201f, 18.636f, 23.195f, 17.368f, 22.406f, 16.591f)
                lineTo(18.33f, 12.577f)
                curveTo(17.954f, 12.207f, 17.447f, 12f, 16.92f, 12f)
                lineTo(14.002f, 12.002f)
                curveTo(12.896f, 12.003f, 12f, 12.896f, 12f, 13.998f)
                verticalLineTo(16.935f)
                curveTo(12f, 17.457f, 12.205f, 17.959f, 12.572f, 18.332f)
                close()
                moveTo(15.996f, 15f)
                curveTo(15.996f, 15.552f, 15.549f, 16f, 14.997f, 16f)
                curveTo(14.445f, 16f, 13.998f, 15.552f, 13.998f, 15f)
                curveTo(13.998f, 14.448f, 14.445f, 14f, 14.997f, 14f)
                curveTo(15.549f, 14f, 15.996f, 14.448f, 15.996f, 15f)
                close()
            }
        }.build()

        return _ShoppingBagTag!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBagTag: ImageVector? = null

@Preview
@Composable
private fun ShoppingBagTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShoppingBagTag, contentDescription = null)
    }
}
