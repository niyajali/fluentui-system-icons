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

public val FluentUi.Regular.Bench: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bench",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 4f)
            curveTo(4.231f, 4f, 3f, 5.231f, 3f, 6.75f)
            verticalLineTo(12.05f)
            curveTo(1.859f, 12.282f, 1f, 13.29f, 1f, 14.5f)
            curveTo(1f, 15.71f, 1.859f, 16.718f, 3f, 16.95f)
            verticalLineTo(19.25f)
            curveTo(3f, 19.664f, 3.336f, 20f, 3.75f, 20f)
            curveTo(4.164f, 20f, 4.5f, 19.664f, 4.5f, 19.25f)
            verticalLineTo(17f)
            horizontalLineTo(19.5f)
            verticalLineTo(19.25f)
            curveTo(19.5f, 19.664f, 19.836f, 20f, 20.25f, 20f)
            curveTo(20.664f, 20f, 21f, 19.664f, 21f, 19.25f)
            verticalLineTo(16.95f)
            curveTo(22.141f, 16.718f, 23f, 15.71f, 23f, 14.5f)
            curveTo(23f, 13.29f, 22.141f, 12.282f, 21f, 12.05f)
            verticalLineTo(6.75f)
            curveTo(21f, 5.231f, 19.769f, 4f, 18.25f, 4f)
            horizontalLineTo(5.75f)
            close()
            moveTo(19.5f, 12f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.75f)
            curveTo(4.5f, 6.06f, 5.06f, 5.5f, 5.75f, 5.5f)
            horizontalLineTo(18.25f)
            curveTo(18.94f, 5.5f, 19.5f, 6.06f, 19.5f, 6.75f)
            verticalLineTo(12f)
            close()
            moveTo(20.5f, 15.5f)
            horizontalLineTo(3.5f)
            curveTo(2.948f, 15.5f, 2.5f, 15.052f, 2.5f, 14.5f)
            curveTo(2.5f, 13.948f, 2.948f, 13.5f, 3.5f, 13.5f)
            horizontalLineTo(20.5f)
            curveTo(21.052f, 13.5f, 21.5f, 13.948f, 21.5f, 14.5f)
            curveTo(21.5f, 15.052f, 21.052f, 15.5f, 20.5f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BenchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Bench, contentDescription = null)
    }
}
