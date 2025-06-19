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

public val FluentIcons.Filled.HomeGarage: ImageVector
    get() {
        if (_HomeGarage != null) {
            return _HomeGarage!!
        }
        _HomeGarage = ImageVector.Builder(
            name = "Filled.HomeGarage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.456f, 2.534f)
                curveTo(12.616f, 1.822f, 11.384f, 1.822f, 10.544f, 2.534f)
                lineTo(3.794f, 8.262f)
                curveTo(3.29f, 8.689f, 3f, 9.316f, 3f, 9.977f)
                verticalLineTo(19.25f)
                curveTo(3f, 20.216f, 3.783f, 21f, 4.75f, 21f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.75f)
                curveTo(6.5f, 13.783f, 7.284f, 13f, 8.25f, 13f)
                horizontalLineTo(15.75f)
                curveTo(16.716f, 13f, 17.5f, 13.783f, 17.5f, 14.75f)
                verticalLineTo(21f)
                horizontalLineTo(19.25f)
                curveTo(20.216f, 21f, 21f, 20.216f, 21f, 19.25f)
                verticalLineTo(9.977f)
                curveTo(21f, 9.316f, 20.709f, 8.689f, 20.206f, 8.262f)
                lineTo(13.456f, 2.534f)
                close()
                moveTo(16f, 21f)
                horizontalLineTo(8f)
                verticalLineTo(18.5f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                close()
                moveTo(16f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(14.75f)
                curveTo(8f, 14.612f, 8.112f, 14.5f, 8.25f, 14.5f)
                horizontalLineTo(15.75f)
                curveTo(15.888f, 14.5f, 16f, 14.612f, 16f, 14.75f)
                verticalLineTo(17f)
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
        Image(imageVector = FluentIcons.Filled.HomeGarage, contentDescription = null)
    }
}
