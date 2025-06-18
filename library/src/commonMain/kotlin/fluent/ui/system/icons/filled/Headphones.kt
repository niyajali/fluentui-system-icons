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

public val FluentUi.Filled.Headphones: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Headphones",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            verticalLineTo(19f)
            curveTo(22f, 20.657f, 20.657f, 22f, 19f, 22f)
            horizontalLineTo(16f)
            curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
            verticalLineTo(15f)
            curveTo(15f, 14.448f, 15.448f, 14f, 16f, 14f)
            horizontalLineTo(20.5f)
            verticalLineTo(12f)
            curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            verticalLineTo(14f)
            horizontalLineTo(8f)
            curveTo(8.552f, 14f, 9f, 14.448f, 9f, 15f)
            verticalLineTo(21f)
            curveTo(9f, 21.552f, 8.552f, 22f, 8f, 22f)
            horizontalLineTo(5f)
            curveTo(3.343f, 22f, 2f, 20.657f, 2f, 19f)
            verticalLineTo(12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HeadphonesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Headphones, contentDescription = null)
    }
}
