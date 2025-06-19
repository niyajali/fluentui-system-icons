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

public val FluentIcons.Regular.HomeGarage: ImageVector
    get() {
        if (_HomeGarage != null) {
            return _HomeGarage!!
        }
        _HomeGarage = ImageVector.Builder(
            name = "Regular.HomeGarage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.515f, 3.678f)
                lineTo(4.765f, 9.405f)
                curveTo(4.597f, 9.548f, 4.5f, 9.757f, 4.5f, 9.977f)
                verticalLineTo(19.25f)
                curveTo(4.5f, 19.388f, 4.612f, 19.5f, 4.75f, 19.5f)
                horizontalLineTo(7f)
                verticalLineTo(14.25f)
                curveTo(7f, 13.283f, 7.784f, 12.5f, 8.75f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(16.216f, 12.5f, 17f, 13.283f, 17f, 14.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 19.5f, 19.5f, 19.388f, 19.5f, 19.25f)
                verticalLineTo(9.977f)
                curveTo(19.5f, 9.757f, 19.403f, 9.548f, 19.235f, 9.405f)
                lineTo(12.485f, 3.678f)
                curveTo(12.205f, 3.441f, 11.795f, 3.441f, 11.515f, 3.678f)
                close()
                moveTo(8.5f, 17.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(8.5f)
                close()
                moveTo(15.5f, 16f)
                verticalLineTo(14.25f)
                curveTo(15.5f, 14.112f, 15.388f, 14f, 15.25f, 14f)
                horizontalLineTo(8.75f)
                curveTo(8.612f, 14f, 8.5f, 14.112f, 8.5f, 14.25f)
                verticalLineTo(16f)
                horizontalLineTo(15.5f)
                close()
                moveTo(4.75f, 21f)
                curveTo(3.783f, 21f, 3f, 20.216f, 3f, 19.25f)
                verticalLineTo(9.977f)
                curveTo(3f, 9.317f, 3.29f, 8.689f, 3.794f, 8.262f)
                lineTo(10.544f, 2.534f)
                curveTo(11.384f, 1.822f, 12.616f, 1.822f, 13.456f, 2.534f)
                lineTo(20.206f, 8.262f)
                curveTo(20.709f, 8.689f, 21f, 9.317f, 21f, 9.977f)
                verticalLineTo(19.25f)
                curveTo(21f, 20.216f, 20.216f, 21f, 19.25f, 21f)
                horizontalLineTo(4.75f)
                close()
            }
        }.build()

        return _HomeGarage!!
    }

@Suppress("ObjectPropertyName")
private var _HomeGarage: ImageVector? = null

@Preview
@Composable
private fun HomeGaragePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.HomeGarage, contentDescription = null)
    }
}
