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

public val FluentUi.Filled.SquareHint: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SquareHint",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10f, 4f)
            curveTo(10f, 3.448f, 10.448f, 3f, 11f, 3f)
            horizontalLineTo(13f)
            curveTo(13.552f, 3f, 14f, 3.448f, 14f, 4f)
            curveTo(14f, 4.552f, 13.552f, 5f, 13f, 5f)
            horizontalLineTo(11f)
            curveTo(10.448f, 5f, 10f, 4.552f, 10f, 4f)
            close()
            moveTo(17.5f, 5f)
            curveTo(16.948f, 5f, 16.5f, 4.552f, 16.5f, 4f)
            curveTo(16.5f, 3.448f, 16.948f, 3f, 17.5f, 3f)
            curveTo(19.433f, 3f, 21f, 4.567f, 21f, 6.5f)
            curveTo(21f, 7.052f, 20.552f, 7.5f, 20f, 7.5f)
            curveTo(19.448f, 7.5f, 19f, 7.052f, 19f, 6.5f)
            curveTo(19f, 5.672f, 18.328f, 5f, 17.5f, 5f)
            close()
            moveTo(6.5f, 3f)
            curveTo(7.052f, 3f, 7.5f, 3.448f, 7.5f, 4f)
            curveTo(7.5f, 4.552f, 7.052f, 5f, 6.5f, 5f)
            curveTo(5.672f, 5f, 5f, 5.672f, 5f, 6.5f)
            curveTo(5f, 7.052f, 4.552f, 7.5f, 4f, 7.5f)
            curveTo(3.448f, 7.5f, 3f, 7.052f, 3f, 6.5f)
            curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
            close()
            moveTo(4f, 16.5f)
            curveTo(3.448f, 16.5f, 3f, 16.948f, 3f, 17.5f)
            curveTo(3f, 19.433f, 4.567f, 21f, 6.5f, 21f)
            curveTo(7.052f, 21f, 7.5f, 20.552f, 7.5f, 20f)
            curveTo(7.5f, 19.448f, 7.052f, 19f, 6.5f, 19f)
            curveTo(5.672f, 19f, 5f, 18.328f, 5f, 17.5f)
            curveTo(5f, 16.948f, 4.552f, 16.5f, 4f, 16.5f)
            close()
            moveTo(11f, 19f)
            curveTo(10.448f, 19f, 10f, 19.448f, 10f, 20f)
            curveTo(10f, 20.552f, 10.448f, 21f, 11f, 21f)
            horizontalLineTo(13f)
            curveTo(13.552f, 21f, 14f, 20.552f, 14f, 20f)
            curveTo(14f, 19.448f, 13.552f, 19f, 13f, 19f)
            horizontalLineTo(11f)
            close()
            moveTo(17.5f, 19f)
            curveTo(16.948f, 19f, 16.5f, 19.448f, 16.5f, 20f)
            curveTo(16.5f, 20.552f, 16.948f, 21f, 17.5f, 21f)
            curveTo(19.433f, 21f, 21f, 19.433f, 21f, 17.5f)
            curveTo(21f, 16.948f, 20.552f, 16.5f, 20f, 16.5f)
            curveTo(19.448f, 16.5f, 19f, 16.948f, 19f, 17.5f)
            curveTo(19f, 18.328f, 18.328f, 19f, 17.5f, 19f)
            close()
            moveTo(20f, 10f)
            curveTo(20.552f, 10f, 21f, 10.448f, 21f, 11f)
            verticalLineTo(13f)
            curveTo(21f, 13.552f, 20.552f, 14f, 20f, 14f)
            curveTo(19.448f, 14f, 19f, 13.552f, 19f, 13f)
            verticalLineTo(11f)
            curveTo(19f, 10.448f, 19.448f, 10f, 20f, 10f)
            close()
            moveTo(3f, 13f)
            curveTo(3f, 13.552f, 3.448f, 14f, 4f, 14f)
            curveTo(4.552f, 14f, 5f, 13.552f, 5f, 13f)
            verticalLineTo(11f)
            curveTo(5f, 10.448f, 4.552f, 10f, 4f, 10f)
            curveTo(3.448f, 10f, 3f, 10.448f, 3f, 11f)
            verticalLineTo(13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SquareHintPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.SquareHint, contentDescription = null)
    }
}
