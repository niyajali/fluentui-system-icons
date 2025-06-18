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

public val FluentUi.Filled.Shapes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Shapes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 8.75f)
            curveTo(2f, 5.022f, 5.022f, 2f, 8.75f, 2f)
            curveTo(12.224f, 2f, 15.086f, 4.625f, 15.459f, 8f)
            horizontalLineTo(12.25f)
            curveTo(9.903f, 8f, 8f, 9.903f, 8f, 12.25f)
            verticalLineTo(15.459f)
            curveTo(4.625f, 15.086f, 2f, 12.224f, 2f, 8.75f)
            close()
            moveTo(12.25f, 9f)
            curveTo(10.455f, 9f, 9f, 10.455f, 9f, 12.25f)
            verticalLineTo(18.75f)
            curveTo(9f, 20.545f, 10.455f, 22f, 12.25f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(12.25f)
            curveTo(22f, 10.455f, 20.545f, 9f, 18.75f, 9f)
            horizontalLineTo(12.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShapesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Shapes, contentDescription = null)
    }
}
