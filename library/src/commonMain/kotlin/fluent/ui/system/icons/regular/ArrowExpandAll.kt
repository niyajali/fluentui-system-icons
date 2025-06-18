package fluent.ui.system.icons.regular

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.ArrowExpandAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExpandAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 4f, 22f, 4.336f, 22f, 4.75f)
            curveTo(22f, 5.164f, 21.664f, 5.5f, 21.25f, 5.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5.5f, 2f, 5.164f, 2f, 4.75f)
            close()
            moveTo(12f, 8.75f)
            curveTo(12f, 8.336f, 12.336f, 8f, 12.75f, 8f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 8f, 22f, 8.336f, 22f, 8.75f)
            curveTo(22f, 9.164f, 21.664f, 9.5f, 21.25f, 9.5f)
            horizontalLineTo(12.75f)
            curveTo(12.336f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            close()
            moveTo(7.28f, 19.78f)
            curveTo(7.14f, 19.921f, 6.949f, 20f, 6.75f, 20f)
            curveTo(6.551f, 20f, 6.36f, 19.921f, 6.22f, 19.78f)
            lineTo(3.22f, 16.78f)
            curveTo(2.927f, 16.487f, 2.927f, 16.013f, 3.22f, 15.72f)
            curveTo(3.513f, 15.427f, 3.987f, 15.427f, 4.28f, 15.72f)
            lineTo(6f, 17.439f)
            verticalLineTo(8.75f)
            curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
            curveTo(7.164f, 8f, 7.5f, 8.336f, 7.5f, 8.75f)
            verticalLineTo(17.439f)
            lineTo(9.22f, 15.72f)
            curveTo(9.513f, 15.427f, 9.987f, 15.427f, 10.28f, 15.72f)
            curveTo(10.573f, 16.013f, 10.573f, 16.487f, 10.28f, 16.78f)
            lineTo(7.28f, 19.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExpandAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowExpandAll, contentDescription = null)
    }
}
