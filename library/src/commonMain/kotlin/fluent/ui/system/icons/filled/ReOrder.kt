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

public val FluentIcons.Filled.ReOrder: ImageVector
    get() {
        if (_ReOrder != null) {
            return _ReOrder!!
        }
        _ReOrder = ImageVector.Builder(
            name = "Filled.ReOrder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
                curveTo(22f, 14.513f, 21.614f, 14.936f, 21.117f, 14.993f)
                lineTo(21f, 15f)
                horizontalLineTo(3f)
                curveTo(2.448f, 15f, 2f, 14.552f, 2f, 14f)
                curveTo(2f, 13.487f, 2.386f, 13.064f, 2.883f, 13.007f)
                lineTo(3f, 13f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 9f)
                horizontalLineTo(21f)
                curveTo(21.552f, 9f, 22f, 9.448f, 22f, 10f)
                curveTo(22f, 10.513f, 21.614f, 10.936f, 21.117f, 10.993f)
                lineTo(21f, 11f)
                horizontalLineTo(3f)
                curveTo(2.448f, 11f, 2f, 10.552f, 2f, 10f)
                curveTo(2f, 9.487f, 2.386f, 9.064f, 2.883f, 9.007f)
                lineTo(3f, 9f)
                horizontalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _ReOrder!!
    }

@Suppress("ObjectPropertyName")
private var _ReOrder: ImageVector? = null

@Preview
@Composable
private fun ReOrderPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ReOrder, contentDescription = null)
    }
}
