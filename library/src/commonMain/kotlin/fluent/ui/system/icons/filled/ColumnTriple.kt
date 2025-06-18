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

public val FluentUi.Filled.ColumnTriple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ColumnTriple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 21f)
            curveTo(3.119f, 21f, 2f, 19.881f, 2f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(2f, 4.119f, 3.119f, 3f, 4.5f, 3f)
            horizontalLineTo(5.5f)
            curveTo(6.881f, 3f, 8f, 4.119f, 8f, 5.5f)
            lineTo(8f, 18.5f)
            curveTo(8f, 19.881f, 6.881f, 21f, 5.5f, 21f)
            horizontalLineTo(4.5f)
            close()
            moveTo(11.5f, 21f)
            curveTo(10.119f, 21f, 9f, 19.881f, 9f, 18.5f)
            lineTo(9f, 5.5f)
            curveTo(9f, 4.119f, 10.119f, 3f, 11.5f, 3f)
            horizontalLineTo(12.5f)
            curveTo(13.881f, 3f, 15f, 4.119f, 15f, 5.5f)
            verticalLineTo(18.5f)
            curveTo(15f, 19.881f, 13.881f, 21f, 12.5f, 21f)
            horizontalLineTo(11.5f)
            close()
            moveTo(16f, 18.5f)
            curveTo(16f, 19.881f, 17.119f, 21f, 18.5f, 21f)
            horizontalLineTo(19.5f)
            curveTo(20.881f, 21f, 22f, 19.881f, 22f, 18.5f)
            verticalLineTo(5.5f)
            curveTo(22f, 4.119f, 20.881f, 3f, 19.5f, 3f)
            horizontalLineTo(18.5f)
            curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
            lineTo(16f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ColumnTriplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ColumnTriple, contentDescription = null)
    }
}
