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

public val FluentIcons.Regular.PollHorizontal: ImageVector
    get() {
        if (_PollHorizontal != null) {
            return _PollHorizontal!!
        }
        _PollHorizontal = ImageVector.Builder(
            name = "Regular.PollHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 11.752f)
                curveTo(22f, 13.272f, 20.768f, 14.504f, 19.249f, 14.504f)
                horizontalLineTo(4.75f)
                curveTo(3.23f, 14.504f, 1.998f, 13.272f, 1.998f, 11.752f)
                curveTo(1.998f, 10.232f, 3.23f, 9f, 4.75f, 9f)
                horizontalLineTo(19.249f)
                curveTo(20.768f, 9f, 22f, 10.232f, 22f, 11.752f)
                close()
                moveTo(17f, 18.752f)
                curveTo(17f, 20.272f, 15.768f, 21.504f, 14.248f, 21.504f)
                horizontalLineTo(4.75f)
                curveTo(3.23f, 21.504f, 1.998f, 20.272f, 1.998f, 18.752f)
                curveTo(1.998f, 17.232f, 3.23f, 16f, 4.75f, 16f)
                horizontalLineTo(14.248f)
                curveTo(15.768f, 16f, 17f, 17.232f, 17f, 18.752f)
                close()
                moveTo(12f, 4.752f)
                curveTo(12f, 6.272f, 10.768f, 7.504f, 9.248f, 7.504f)
                horizontalLineTo(4.75f)
                curveTo(3.23f, 7.504f, 1.998f, 6.272f, 1.998f, 4.752f)
                curveTo(1.998f, 3.232f, 3.23f, 2f, 4.75f, 2f)
                horizontalLineTo(9.248f)
                curveTo(10.768f, 2f, 12f, 3.232f, 12f, 4.752f)
                close()
                moveTo(20.5f, 11.752f)
                curveTo(20.5f, 11.061f, 19.94f, 10.5f, 19.249f, 10.5f)
                horizontalLineTo(4.75f)
                curveTo(4.059f, 10.5f, 3.498f, 11.061f, 3.498f, 11.752f)
                curveTo(3.498f, 12.443f, 4.059f, 13.004f, 4.75f, 13.004f)
                horizontalLineTo(19.249f)
                curveTo(19.94f, 13.004f, 20.5f, 12.443f, 20.5f, 11.752f)
                close()
                moveTo(15.5f, 18.752f)
                curveTo(15.5f, 18.06f, 14.94f, 17.5f, 14.248f, 17.5f)
                horizontalLineTo(4.75f)
                curveTo(4.059f, 17.5f, 3.498f, 18.06f, 3.498f, 18.752f)
                curveTo(3.498f, 19.443f, 4.059f, 20.004f, 4.75f, 20.004f)
                horizontalLineTo(14.248f)
                curveTo(14.94f, 20.004f, 15.5f, 19.443f, 15.5f, 18.752f)
                close()
                moveTo(10.5f, 4.752f)
                curveTo(10.5f, 4.06f, 9.94f, 3.5f, 9.248f, 3.5f)
                horizontalLineTo(4.75f)
                curveTo(4.059f, 3.5f, 3.498f, 4.06f, 3.498f, 4.752f)
                curveTo(3.498f, 5.443f, 4.059f, 6.004f, 4.75f, 6.004f)
                horizontalLineTo(9.248f)
                curveTo(9.94f, 6.004f, 10.5f, 5.443f, 10.5f, 4.752f)
                close()
            }
        }.build()

        return _PollHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _PollHorizontal: ImageVector? = null

@Preview
@Composable
private fun PollHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PollHorizontal, contentDescription = null)
    }
}
