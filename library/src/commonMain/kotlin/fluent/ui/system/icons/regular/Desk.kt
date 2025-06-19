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

public val FluentIcons.Regular.Desk: ImageVector
    get() {
        if (_Desk != null) {
            return _Desk!!
        }
        _Desk = ImageVector.Builder(
            name = "Regular.Desk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4.25f, 4f)
                curveTo(3.007f, 4f, 2f, 5.007f, 2f, 6.25f)
                verticalLineTo(17.25f)
                curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
                horizontalLineTo(9.25f)
                curveTo(10.769f, 20f, 12f, 18.769f, 12f, 17.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(19.25f)
                curveTo(20.5f, 19.664f, 20.836f, 20f, 21.25f, 20f)
                curveTo(21.664f, 20f, 22f, 19.664f, 22f, 19.25f)
                verticalLineTo(6.25f)
                curveTo(22f, 5.007f, 20.993f, 4f, 19.75f, 4f)
                horizontalLineTo(4.25f)
                close()
                moveTo(3.5f, 9.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.25f)
                curveTo(10.5f, 17.94f, 9.94f, 18.5f, 9.25f, 18.5f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
                verticalLineTo(9.5f)
                close()
                moveTo(3.5f, 8f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.836f, 3.836f, 5.5f, 4.25f, 5.5f)
                horizontalLineTo(19.75f)
                curveTo(20.164f, 5.5f, 20.5f, 5.836f, 20.5f, 6.25f)
                verticalLineTo(8f)
                horizontalLineTo(3.5f)
                close()
                moveTo(5.75f, 11.5f)
                curveTo(5.336f, 11.5f, 5f, 11.836f, 5f, 12.25f)
                curveTo(5f, 12.664f, 5.336f, 13f, 5.75f, 13f)
                horizontalLineTo(8.25f)
                curveTo(8.664f, 13f, 9f, 12.664f, 9f, 12.25f)
                curveTo(9f, 11.836f, 8.664f, 11.5f, 8.25f, 11.5f)
                horizontalLineTo(5.75f)
                close()
            }
        }.build()

        return _Desk!!
    }

@Suppress("ObjectPropertyName")
private var _Desk: ImageVector? = null

@Preview
@Composable
private fun DeskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Desk, contentDescription = null)
    }
}
