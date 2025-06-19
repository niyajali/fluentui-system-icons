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

public val FluentIcons.Regular.Money: ImageVector
    get() {
        if (_Money != null) {
            return _Money!!
        }
        _Money = ImageVector.Builder(
            name = "Regular.Money",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.5f, 8f)
                curveTo(8.843f, 8f, 7.5f, 9.343f, 7.5f, 11f)
                curveTo(7.5f, 12.657f, 8.843f, 14f, 10.5f, 14f)
                curveTo(12.157f, 14f, 13.5f, 12.657f, 13.5f, 11f)
                curveTo(13.5f, 9.343f, 12.157f, 8f, 10.5f, 8f)
                close()
                moveTo(9f, 11f)
                curveTo(9f, 10.172f, 9.672f, 9.5f, 10.5f, 9.5f)
                curveTo(11.328f, 9.5f, 12f, 10.172f, 12f, 11f)
                curveTo(12f, 11.828f, 11.328f, 12.5f, 10.5f, 12.5f)
                curveTo(9.672f, 12.5f, 9f, 11.828f, 9f, 11f)
                close()
                moveTo(2f, 7.25f)
                curveTo(2f, 6.007f, 3.007f, 5f, 4.25f, 5f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 5f, 19f, 6.007f, 19f, 7.25f)
                verticalLineTo(14.75f)
                curveTo(19f, 15.993f, 17.993f, 17f, 16.75f, 17f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 17f, 2f, 15.993f, 2f, 14.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(4.25f, 6.5f)
                curveTo(3.836f, 6.5f, 3.5f, 6.836f, 3.5f, 7.25f)
                verticalLineTo(8f)
                horizontalLineTo(4.25f)
                curveTo(4.664f, 8f, 5f, 7.664f, 5f, 7.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(4.25f)
                close()
                moveTo(3.5f, 12.5f)
                horizontalLineTo(4.25f)
                curveTo(5.493f, 12.5f, 6.5f, 13.507f, 6.5f, 14.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(14.75f)
                curveTo(14.5f, 13.507f, 15.507f, 12.5f, 16.75f, 12.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.75f)
                curveTo(15.507f, 9.5f, 14.5f, 8.493f, 14.5f, 7.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(7.25f)
                curveTo(6.5f, 8.493f, 5.493f, 9.5f, 4.25f, 9.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(17.5f, 8f)
                verticalLineTo(7.25f)
                curveTo(17.5f, 6.836f, 17.164f, 6.5f, 16.75f, 6.5f)
                horizontalLineTo(16f)
                verticalLineTo(7.25f)
                curveTo(16f, 7.664f, 16.336f, 8f, 16.75f, 8f)
                horizontalLineTo(17.5f)
                close()
                moveTo(17.5f, 14f)
                horizontalLineTo(16.75f)
                curveTo(16.336f, 14f, 16f, 14.336f, 16f, 14.75f)
                verticalLineTo(15.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 15.5f, 17.5f, 15.164f, 17.5f, 14.75f)
                verticalLineTo(14f)
                close()
                moveTo(3.5f, 14.75f)
                curveTo(3.5f, 15.164f, 3.836f, 15.5f, 4.25f, 15.5f)
                horizontalLineTo(5f)
                verticalLineTo(14.75f)
                curveTo(5f, 14.336f, 4.664f, 14f, 4.25f, 14f)
                horizontalLineTo(3.5f)
                verticalLineTo(14.75f)
                close()
                moveTo(4.401f, 18.5f)
                curveTo(4.92f, 19.397f, 5.89f, 20f, 7f, 20f)
                horizontalLineTo(17.25f)
                curveTo(19.873f, 20f, 22f, 17.873f, 22f, 15.25f)
                verticalLineTo(10f)
                curveTo(22f, 8.89f, 21.397f, 7.92f, 20.5f, 7.401f)
                verticalLineTo(15.25f)
                curveTo(20.5f, 17.045f, 19.045f, 18.5f, 17.25f, 18.5f)
                horizontalLineTo(4.401f)
                close()
            }
        }.build()

        return _Money!!
    }

@Suppress("ObjectPropertyName")
private var _Money: ImageVector? = null

@Preview
@Composable
private fun MoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Money, contentDescription = null)
    }
}
