package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.ShoppingBagArrowLeft: ImageVector
    get() {
        if (_ShoppingBagArrowLeft != null) {
            return _ShoppingBagArrowLeft!!
        }
        _ShoppingBagArrowLeft = ImageVector.Builder(
            name = "Regular.ShoppingBagArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(16.65f, 14.646f)
                lineTo(16.719f, 14.589f)
                curveTo(16.914f, 14.454f, 17.184f, 14.473f, 17.357f, 14.646f)
                lineTo(17.415f, 14.716f)
                curveTo(17.55f, 14.911f, 17.531f, 15.18f, 17.357f, 15.354f)
                lineTo(15.711f, 17f)
                horizontalLineTo(20.5f)
                lineTo(20.59f, 17.008f)
                curveTo(20.823f, 17.05f, 21f, 17.254f, 21f, 17.5f)
                lineTo(20.992f, 17.59f)
                curveTo(20.95f, 17.823f, 20.746f, 18f, 20.5f, 18f)
                horizontalLineTo(15.711f)
                lineTo(17.357f, 19.646f)
                lineTo(17.415f, 19.716f)
                curveTo(17.55f, 19.911f, 17.531f, 20.18f, 17.357f, 20.354f)
                curveTo(17.162f, 20.549f, 16.845f, 20.549f, 16.65f, 20.354f)
                lineTo(14.134f, 17.837f)
                lineTo(14.083f, 17.771f)
                lineTo(14.05f, 17.71f)
                lineTo(14.021f, 17.63f)
                lineTo(14.006f, 17.544f)
                lineTo(14.008f, 17.434f)
                lineTo(14.027f, 17.349f)
                lineTo(14.05f, 17.29f)
                lineTo(14.094f, 17.213f)
                lineTo(14.134f, 17.163f)
                lineTo(16.65f, 14.646f)
                close()
                moveTo(7f, 7f)
                verticalLineTo(5f)
                curveTo(7f, 3.343f, 8.343f, 2f, 10f, 2f)
                curveTo(10.768f, 2f, 11.469f, 2.289f, 12f, 2.764f)
                curveTo(12.531f, 2.289f, 13.232f, 2f, 14f, 2f)
                curveTo(15.657f, 2f, 17f, 3.343f, 17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(18.5f)
                curveTo(19.328f, 7f, 20f, 7.672f, 20f, 8.5f)
                verticalLineTo(11.498f)
                curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.732f)
                curveTo(13.949f, 12.019f, 13.444f, 12.383f, 13f, 12.81f)
                verticalLineTo(8.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(18f)
                curveTo(5.5f, 19.381f, 6.619f, 20.5f, 8f, 20.5f)
                horizontalLineTo(11.732f)
                curveTo(12.019f, 21.051f, 12.383f, 21.556f, 12.81f, 22f)
                horizontalLineTo(8f)
                curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                horizontalLineTo(7f)
                close()
                moveTo(10f, 3.5f)
                curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(11.5f)
                verticalLineTo(5f)
                curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
                close()
                moveTo(15.5f, 7f)
                verticalLineTo(5f)
                curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
                curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
                curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                close()
            }
        }.build()

        return _ShoppingBagArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ShoppingBagArrowLeft: ImageVector? = null

@Preview
@Composable
private fun ShoppingBagArrowLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ShoppingBagArrowLeft, contentDescription = null)
    }
}
