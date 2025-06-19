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

public val FluentIcons.Filled.TeardropBottomRight: ImageVector
    get() {
        if (_TeardropBottomRight != null) {
            return _TeardropBottomRight!!
        }
        _TeardropBottomRight = ImageVector.Builder(
            name = "Filled.TeardropBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                verticalLineTo(19.75f)
                curveTo(22f, 20.993f, 20.993f, 22f, 19.75f, 22f)
                horizontalLineTo(12f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
            }
        }.build()

        return _TeardropBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _TeardropBottomRight: ImageVector? = null

@Preview
@Composable
private fun TeardropBottomRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TeardropBottomRight, contentDescription = null)
    }
}
