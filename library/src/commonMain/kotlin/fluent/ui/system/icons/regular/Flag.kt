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

public val FluentIcons.Regular.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Regular.Flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 3.748f)
                curveTo(3f, 3.334f, 3.336f, 2.998f, 3.75f, 2.998f)
                horizontalLineTo(20.254f)
                curveTo(20.872f, 2.998f, 21.225f, 3.704f, 20.854f, 4.198f)
                lineTo(16.69f, 9.749f)
                lineTo(20.854f, 15.3f)
                curveTo(21.225f, 15.795f, 20.872f, 16.5f, 20.254f, 16.5f)
                lineTo(4.5f, 16.5f)
                verticalLineTo(21.25f)
                curveTo(4.5f, 21.63f, 4.218f, 21.943f, 3.852f, 21.993f)
                lineTo(3.75f, 22f)
                curveTo(3.37f, 22f, 3.057f, 21.718f, 3.007f, 21.352f)
                lineTo(3f, 21.25f)
                verticalLineTo(3.748f)
                close()
                moveTo(18.754f, 4.498f)
                horizontalLineTo(4.5f)
                verticalLineTo(15f)
                horizontalLineTo(18.754f)
                lineTo(15.152f, 10.199f)
                curveTo(14.952f, 9.933f, 14.952f, 9.566f, 15.152f, 9.299f)
                lineTo(18.754f, 4.498f)
                close()
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null

@Preview
@Composable
private fun FlagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Flag, contentDescription = null)
    }
}
