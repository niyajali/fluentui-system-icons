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

public val FluentIcons.Filled.Search: ImageVector
    get() {
        if (_Search != null) {
            return _Search!!
        }
        _Search = ImageVector.Builder(
            name = "Filled.Search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.843f, 16.368f)
                curveTo(13.499f, 17.392f, 11.82f, 18f, 10f, 18f)
                curveTo(5.582f, 18f, 2f, 14.418f, 2f, 10f)
                curveTo(2f, 5.582f, 5.582f, 2f, 10f, 2f)
                curveTo(14.418f, 2f, 18f, 5.582f, 18f, 10f)
                curveTo(18f, 11.877f, 17.354f, 13.603f, 16.271f, 14.967f)
                lineTo(20.698f, 19.284f)
                curveTo(21.094f, 19.67f, 21.101f, 20.303f, 20.716f, 20.698f)
                curveTo(20.33f, 21.094f, 19.697f, 21.101f, 19.302f, 20.716f)
                lineTo(14.843f, 16.368f)
                close()
                moveTo(16f, 10f)
                curveTo(16f, 6.686f, 13.314f, 4f, 10f, 4f)
                curveTo(6.686f, 4f, 4f, 6.686f, 4f, 10f)
                curveTo(4f, 13.314f, 6.686f, 16f, 10f, 16f)
                curveTo(13.314f, 16f, 16f, 13.314f, 16f, 10f)
                close()
            }
        }.build()

        return _Search!!
    }

@Suppress("ObjectPropertyName")
private var _Search: ImageVector? = null

@Preview
@Composable
private fun SearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Search, contentDescription = null)
    }
}
