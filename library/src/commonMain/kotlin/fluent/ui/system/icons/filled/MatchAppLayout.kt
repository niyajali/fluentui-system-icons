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

public val FluentIcons.Filled.MatchAppLayout: ImageVector
    get() {
        if (_MatchAppLayout != null) {
            return _MatchAppLayout!!
        }
        _MatchAppLayout = ImageVector.Builder(
            name = "Filled.MatchAppLayout",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.5f, 8f)
                curveTo(10.467f, 8f, 11.25f, 8.783f, 11.25f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(11.25f, 15.217f, 10.467f, 16f, 9.5f, 16f)
                horizontalLineTo(3.75f)
                curveTo(2.783f, 16f, 2f, 15.217f, 2f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(2f, 8.832f, 2.707f, 8.079f, 3.606f, 8.006f)
                lineTo(3.75f, 8f)
                horizontalLineTo(9.5f)
                close()
                moveTo(20.25f, 8f)
                curveTo(21.216f, 8f, 22f, 8.783f, 22f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(22f, 15.217f, 21.216f, 16f, 20.25f, 16f)
                horizontalLineTo(14.5f)
                curveTo(13.533f, 16f, 12.75f, 15.217f, 12.75f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(12.75f, 8.783f, 13.533f, 8f, 14.5f, 8f)
                horizontalLineTo(20.25f)
                close()
            }
        }.build()

        return _MatchAppLayout!!
    }

@Suppress("ObjectPropertyName")
private var _MatchAppLayout: ImageVector? = null

@Preview
@Composable
private fun MatchAppLayoutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MatchAppLayout, contentDescription = null)
    }
}
