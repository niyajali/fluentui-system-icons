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

public val FluentIcons.Regular.DividerTall: ImageVector
    get() {
        if (_DividerTall != null) {
            return _DividerTall!!
        }
        _DividerTall = ImageVector.Builder(
            name = "Regular.DividerTall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.25f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(11.25f, 21.664f, 11.586f, 22f, 12f, 22f)
                curveTo(12.414f, 22f, 12.75f, 21.664f, 12.75f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(12.75f, 2.336f, 12.414f, 2f, 12f, 2f)
                curveTo(11.586f, 2f, 11.25f, 2.336f, 11.25f, 2.75f)
                close()
            }
        }.build()

        return _DividerTall!!
    }

@Suppress("ObjectPropertyName")
private var _DividerTall: ImageVector? = null

@Preview
@Composable
private fun DividerTallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DividerTall, contentDescription = null)
    }
}
