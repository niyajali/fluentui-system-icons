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

public val FluentIcons.Regular.ReOrder: ImageVector
    get() {
        if (_ReOrder != null) {
            return _ReOrder!!
        }
        _ReOrder = ImageVector.Builder(
            name = "Regular.ReOrder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2.75f, 13.25f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 13.25f, 22f, 13.586f, 22f, 14f)
                curveTo(22f, 14.38f, 21.718f, 14.693f, 21.352f, 14.743f)
                lineTo(21.25f, 14.75f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 14.75f, 2f, 14.414f, 2f, 14f)
                curveTo(2f, 13.62f, 2.282f, 13.307f, 2.648f, 13.257f)
                lineTo(2.75f, 13.25f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 9.25f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 9.25f, 22f, 9.586f, 22f, 10f)
                curveTo(22f, 10.38f, 21.718f, 10.693f, 21.352f, 10.743f)
                lineTo(21.25f, 10.75f)
                horizontalLineTo(2.75f)
                curveTo(2.336f, 10.75f, 2f, 10.414f, 2f, 10f)
                curveTo(2f, 9.62f, 2.282f, 9.307f, 2.648f, 9.257f)
                lineTo(2.75f, 9.25f)
                horizontalLineTo(21.25f)
                horizontalLineTo(2.75f)
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
        Image(imageVector = FluentIcons.Regular.ReOrder, contentDescription = null)
    }
}
