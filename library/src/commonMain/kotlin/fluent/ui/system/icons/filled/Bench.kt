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

public val FluentUi.Filled.Bench: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Bench",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 4f)
            curveTo(4.231f, 4f, 3f, 5.231f, 3f, 6.75f)
            verticalLineTo(12f)
            horizontalLineTo(21f)
            verticalLineTo(6.75f)
            curveTo(21f, 5.231f, 19.769f, 4f, 18.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveTo(3f, 13f)
            curveTo(1.895f, 13f, 1f, 13.895f, 1f, 15f)
            curveTo(1f, 16.105f, 1.895f, 17f, 3f, 17f)
            verticalLineTo(19.25f)
            curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
            curveTo(4.164f, 20f, 4.5f, 19.664f, 4.5f, 19.25f)
            verticalLineTo(17f)
            horizontalLineTo(19.5f)
            verticalLineTo(19.25f)
            curveTo(19.5f, 19.664f, 19.836f, 20f, 20.25f, 20f)
            curveTo(20.664f, 20f, 21f, 19.664f, 21f, 19.25f)
            lineTo(21f, 17f)
            curveTo(22.105f, 17f, 23f, 16.105f, 23f, 15f)
            curveTo(23f, 13.895f, 22.105f, 13f, 21f, 13f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Bench, contentDescription = null)
    }
}
