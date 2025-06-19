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

public val FluentIcons.Regular.PersonKey: ImageVector
    get() {
        if (_PersonKey != null) {
            return _PersonKey!!
        }
        _PersonKey = ImageVector.Builder(
            name = "Regular.PersonKey",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15f, 15.5f)
                curveTo(15f, 14.974f, 15.09f, 14.469f, 15.256f, 14f)
                horizontalLineTo(6.253f)
                curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
                verticalLineTo(16.826f)
                curveTo(4.004f, 17.719f, 4.322f, 18.583f, 4.902f, 19.261f)
                curveTo(6.298f, 20.896f, 8.345f, 21.793f, 11f, 21.969f)
                verticalLineTo(20.914f)
                curveTo(11f, 20.763f, 11.017f, 20.614f, 11.05f, 20.469f)
                curveTo(8.802f, 20.312f, 7.146f, 19.579f, 6.043f, 18.287f)
                curveTo(5.695f, 17.88f, 5.504f, 17.362f, 5.504f, 16.826f)
                verticalLineTo(16.249f)
                curveTo(5.504f, 15.835f, 5.839f, 15.5f, 6.253f, 15.5f)
                horizontalLineTo(15f)
                close()
                moveTo(12f, 2.004f)
                curveTo(14.762f, 2.004f, 17f, 4.243f, 17f, 7.004f)
                curveTo(17f, 9.766f, 14.762f, 12.004f, 12f, 12.004f)
                curveTo(9.239f, 12.004f, 7f, 9.766f, 7f, 7.004f)
                curveTo(7f, 4.243f, 9.239f, 2.004f, 12f, 2.004f)
                close()
                moveTo(12f, 3.504f)
                curveTo(10.067f, 3.504f, 8.5f, 5.071f, 8.5f, 7.004f)
                curveTo(8.5f, 8.937f, 10.067f, 10.504f, 12f, 10.504f)
                curveTo(13.933f, 10.504f, 15.5f, 8.937f, 15.5f, 7.004f)
                curveTo(15.5f, 5.071f, 13.933f, 3.504f, 12f, 3.504f)
                close()
                moveTo(19.5f, 19f)
                curveTo(21.433f, 19f, 23f, 17.433f, 23f, 15.5f)
                curveTo(23f, 13.567f, 21.433f, 12f, 19.5f, 12f)
                curveTo(17.567f, 12f, 16f, 13.567f, 16f, 15.5f)
                curveTo(16f, 15.806f, 16.04f, 16.104f, 16.114f, 16.387f)
                lineTo(12.293f, 20.207f)
                curveTo(12.106f, 20.395f, 12f, 20.649f, 12f, 20.914f)
                verticalLineTo(22.5f)
                curveTo(12f, 22.776f, 12.224f, 23f, 12.5f, 23f)
                horizontalLineTo(14.5f)
                curveTo(14.776f, 23f, 15f, 22.776f, 15f, 22.5f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                curveTo(16.276f, 22f, 16.5f, 21.776f, 16.5f, 21.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(17.5f)
                curveTo(17.776f, 20.5f, 18f, 20.276f, 18f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(19.5f)
                close()
                moveTo(20f, 14f)
                curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
                curveTo(21f, 15.552f, 20.552f, 16f, 20f, 16f)
                curveTo(19.448f, 16f, 19f, 15.552f, 19f, 15f)
                curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
                close()
            }
        }.build()

        return _PersonKey!!
    }

@Suppress("ObjectPropertyName")
private var _PersonKey: ImageVector? = null

@Preview
@Composable
private fun PersonKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonKey, contentDescription = null)
    }
}
