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

public val FluentUi.Filled.TextExpand: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextExpand",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 18f)
            curveTo(6.448f, 18f, 6f, 18.448f, 6f, 19f)
            curveTo(6f, 19.552f, 6.448f, 20f, 7f, 20f)
            horizontalLineTo(21f)
            curveTo(21.552f, 20f, 22f, 19.552f, 22f, 19f)
            curveTo(22f, 18.448f, 21.552f, 18f, 21f, 18f)
            horizontalLineTo(7f)
            close()
            moveTo(13f, 9f)
            curveTo(13f, 8.448f, 13.448f, 8f, 14f, 8f)
            horizontalLineTo(21f)
            curveTo(21.552f, 8f, 22f, 8.448f, 22f, 9f)
            curveTo(22f, 9.552f, 21.552f, 10f, 21f, 10f)
            horizontalLineTo(14f)
            curveTo(13.448f, 10f, 13f, 9.552f, 13f, 9f)
            close()
            moveTo(6f, 4f)
            curveTo(6f, 3.448f, 6.448f, 3f, 7f, 3f)
            horizontalLineTo(21f)
            curveTo(21.552f, 3f, 22f, 3.448f, 22f, 4f)
            curveTo(22f, 4.552f, 21.552f, 5f, 21f, 5f)
            horizontalLineTo(7f)
            curveTo(6.448f, 5f, 6f, 4.552f, 6f, 4f)
            close()
            moveTo(13f, 14f)
            curveTo(13f, 13.448f, 13.448f, 13f, 14f, 13f)
            horizontalLineTo(21f)
            curveTo(21.552f, 13f, 22f, 13.448f, 22f, 14f)
            curveTo(22f, 14.552f, 21.552f, 15f, 21f, 15f)
            horizontalLineTo(14f)
            curveTo(13.448f, 15f, 13f, 14.552f, 13f, 14f)
            close()
            moveTo(11f, 11.5f)
            curveTo(11f, 13.985f, 8.985f, 16f, 6.5f, 16f)
            curveTo(4.015f, 16f, 2f, 13.985f, 2f, 11.5f)
            curveTo(2f, 9.015f, 4.015f, 7f, 6.5f, 7f)
            curveTo(8.985f, 7f, 11f, 9.015f, 11f, 11.5f)
            close()
            moveTo(7f, 9.5f)
            curveTo(7f, 9.224f, 6.776f, 9f, 6.5f, 9f)
            curveTo(6.224f, 9f, 6f, 9.224f, 6f, 9.5f)
            verticalLineTo(11f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 11f, 4f, 11.224f, 4f, 11.5f)
            curveTo(4f, 11.776f, 4.224f, 12f, 4.5f, 12f)
            horizontalLineTo(6f)
            lineTo(6f, 13.5f)
            curveTo(6f, 13.776f, 6.224f, 14f, 6.5f, 14f)
            curveTo(6.776f, 14f, 7f, 13.776f, 7f, 13.5f)
            verticalLineTo(12f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 12f, 9f, 11.776f, 9f, 11.5f)
            curveTo(9f, 11.224f, 8.776f, 11f, 8.5f, 11f)
            horizontalLineTo(7f)
            verticalLineTo(9.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextExpandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextExpand, contentDescription = null)
    }
}
