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

public val FluentIcons.Filled.DividerShort: ImageVector
    get() {
        if (_DividerShort != null) {
            return _DividerShort!!
        }
        _DividerShort = ImageVector.Builder(
            name = "Filled.DividerShort",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11f, 5f)
                verticalLineTo(19f)
                curveTo(11f, 19.552f, 11.448f, 20f, 12f, 20f)
                curveTo(12.552f, 20f, 13f, 19.552f, 13f, 19f)
                verticalLineTo(5f)
                curveTo(13f, 4.448f, 12.552f, 4f, 12f, 4f)
                curveTo(11.448f, 4f, 11f, 4.448f, 11f, 5f)
                close()
            }
        }.build()

        return _DividerShort!!
    }

@Suppress("ObjectPropertyName")
private var _DividerShort: ImageVector? = null

@Preview
@Composable
private fun DividerShortPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DividerShort, contentDescription = null)
    }
}
