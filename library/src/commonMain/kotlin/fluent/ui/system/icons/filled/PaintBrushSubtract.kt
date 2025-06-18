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

public val FluentUi.Filled.PaintBrushSubtract: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PaintBrushSubtract",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.5f, 5.252f)
            verticalLineTo(2f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 2f, 5f, 2.336f, 5f, 2.75f)
            verticalLineTo(11f)
            horizontalLineTo(19f)
            verticalLineTo(2.75f)
            curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
            horizontalLineTo(16.5f)
            verticalLineTo(6.251f)
            curveTo(16.5f, 6.665f, 16.164f, 7.001f, 15.75f, 7.001f)
            curveTo(15.335f, 7.001f, 15f, 6.665f, 15f, 6.251f)
            verticalLineTo(2f)
            horizontalLineTo(14f)
            verticalLineTo(5.252f)
            curveTo(14f, 5.666f, 13.664f, 6.002f, 13.25f, 6.002f)
            curveTo(12.835f, 6.002f, 12.5f, 5.666f, 12.5f, 5.252f)
            close()
            moveTo(11f, 17.5f)
            curveTo(11f, 15.49f, 11.913f, 13.692f, 13.346f, 12.5f)
            horizontalLineTo(5f)
            verticalLineTo(14.252f)
            curveTo(5f, 15.495f, 6.007f, 16.502f, 7.25f, 16.502f)
            horizontalLineTo(9.5f)
            verticalLineTo(19.5f)
            curveTo(9.5f, 20.881f, 10.619f, 22f, 12f, 22f)
            curveTo(12.248f, 22f, 12.487f, 21.964f, 12.713f, 21.897f)
            curveTo(11.649f, 20.74f, 11f, 19.196f, 11f, 17.5f)
            close()
            moveTo(17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            close()
            moveTo(20.497f, 18f)
            curveTo(20.772f, 18f, 20.996f, 17.776f, 20.996f, 17.5f)
            curveTo(20.996f, 17.224f, 20.772f, 17f, 20.497f, 17f)
            horizontalLineTo(14.496f)
            curveTo(14.22f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
            curveTo(13.996f, 17.776f, 14.22f, 18f, 14.496f, 18f)
            horizontalLineTo(20.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaintBrushSubtractPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PaintBrushSubtract, contentDescription = null)
    }
}
