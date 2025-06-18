package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.TextColumnWide: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextColumnWide",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 5f)
            curveTo(3.448f, 5f, 3f, 5.448f, 3f, 6f)
            curveTo(3f, 6.552f, 3.448f, 7f, 4f, 7f)
            horizontalLineTo(20f)
            curveTo(20.552f, 7f, 21f, 6.552f, 21f, 6f)
            curveTo(21f, 5.448f, 20.552f, 5f, 20f, 5f)
            horizontalLineTo(4f)
            close()
            moveTo(4f, 9f)
            curveTo(3.448f, 9f, 3f, 9.448f, 3f, 10f)
            curveTo(3f, 10.552f, 3.448f, 11f, 4f, 11f)
            horizontalLineTo(20f)
            curveTo(20.552f, 11f, 21f, 10.552f, 21f, 10f)
            curveTo(21f, 9.448f, 20.552f, 9f, 20f, 9f)
            horizontalLineTo(4f)
            close()
            moveTo(3f, 14f)
            curveTo(3f, 13.448f, 3.448f, 13f, 4f, 13f)
            horizontalLineTo(20f)
            curveTo(20.552f, 13f, 21f, 13.448f, 21f, 14f)
            curveTo(21f, 14.552f, 20.552f, 15f, 20f, 15f)
            horizontalLineTo(4f)
            curveTo(3.448f, 15f, 3f, 14.552f, 3f, 14f)
            close()
            moveTo(4f, 17f)
            curveTo(3.448f, 17f, 3f, 17.448f, 3f, 18f)
            curveTo(3f, 18.552f, 3.448f, 19f, 4f, 19f)
            horizontalLineTo(20f)
            curveTo(20.552f, 19f, 21f, 18.552f, 21f, 18f)
            curveTo(21f, 17.448f, 20.552f, 17f, 20f, 17f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextColumnWidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextColumnWide, contentDescription = null)
    }
}
