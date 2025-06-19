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

public val FluentIcons.Filled.ShoppingBagArrowLeft: ImageVector
    get() {
        if (_ShoppingBagArrowLeft != null) {
            return _ShoppingBagArrowLeft!!
        }
        _ShoppingBagArrowLeft = ImageVector.Builder(
            name = "Filled.ShoppingBagArrowLeft",
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
                verticalLineTo(11.498f)
                curveTo(19.23f, 11.177f, 18.386f, 11f, 17.5f, 11f)
                curveTo(16.418f, 11f, 15.398f, 11.264f, 14.5f, 11.732f)
                verticalLineTo(7f)
                horizontalLineTo(15.5f)
                verticalLineTo(5f)
                curveTo(15.5f, 4.172f, 14.828f, 3.5f, 14f, 3.5f)
                curveTo(13.535f, 3.5f, 13.12f, 3.712f, 12.844f, 4.044f)
                curveTo(12.945f, 4.344f, 13f, 4.666f, 13f, 5f)
                verticalLineTo(12.81f)
                curveTo(11.767f, 13.993f, 11f, 15.657f, 11f, 17.5f)
                curveTo(11f, 19.247f, 11.689f, 20.832f, 12.81f, 22f)
                horizontalLineTo(8f)
                curveTo(5.791f, 22f, 4f, 20.209f, 4f, 18f)
                verticalLineTo(8.5f)
                curveTo(4f, 7.672f, 4.672f, 7f, 5.5f, 7f)
                horizontalLineTo(7f)
                close()
                moveTo(11.5f, 5f)
                curveTo(11.5f, 4.172f, 10.828f, 3.5f, 10f, 3.5f)
                curveTo(9.172f, 3.5f, 8.5f, 4.172f, 8.5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(11.5f)
                verticalLineTo(5f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(16.719f, 14.589f)
                lineTo(16.65f, 14.646f)
                lineTo(14.134f, 17.163f)
                lineTo(14.094f, 17.213f)
                lineTo(14.05f, 17.29f)
                lineTo(14.027f, 17.349f)
                lineTo(14.008f, 17.434f)
                lineTo(14.005f, 17.544f)
                lineTo(14.021f, 17.63f)
                lineTo(14.05f, 17.71f)
                lineTo(14.083f, 17.771f)
                lineTo(14.134f, 17.837f)
                lineTo(16.65f, 20.354f)
                curveTo(16.845f, 20.549f, 17.162f, 20.549f, 17.357f, 20.354f)
                curveTo(17.531f, 20.18f, 17.55f, 19.911f, 17.415f, 19.716f)
                lineTo(17.357f, 19.646f)
                lineTo(15.711f, 18f)
                horizontalLineTo(20.5f)
                curveTo(20.746f, 18f, 20.95f, 17.823f, 20.992f, 17.59f)
                lineTo(21f, 17.5f)
                curveTo(21f, 17.254f, 20.823f, 17.05f, 20.59f, 17.008f)
                lineTo(20.5f, 17f)
                horizontalLineTo(15.711f)
                lineTo(17.357f, 15.354f)
                curveTo(17.531f, 15.18f, 17.55f, 14.911f, 17.415f, 14.716f)
                lineTo(17.357f, 14.646f)
                curveTo(17.184f, 14.473f, 16.914f, 14.454f, 16.719f, 14.589f)
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
        Image(imageVector = FluentIcons.Filled.ShoppingBagArrowLeft, contentDescription = null)
    }
}
