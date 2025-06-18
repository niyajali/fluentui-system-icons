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

public val FluentUi.Regular.DocumentTarget: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentTarget",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 2f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(13.169f)
            curveTo(4.238f, 13.031f, 4.489f, 12.912f, 4.75f, 12.815f)
            verticalLineTo(12.75f)
            curveTo(4.75f, 12.155f, 5.047f, 11.63f, 5.5f, 11.314f)
            verticalLineTo(4f)
            curveTo(5.5f, 3.724f, 5.724f, 3.5f, 6f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(20f)
            curveTo(18.5f, 20.276f, 18.276f, 20.5f, 18f, 20.5f)
            horizontalLineTo(10.5f)
            curveTo(10.024f, 21.134f, 9.401f, 21.65f, 8.682f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(9.828f)
            curveTo(20f, 9.297f, 19.789f, 8.789f, 19.414f, 8.414f)
            lineTo(13.586f, 2.586f)
            curveTo(13.211f, 2.211f, 12.703f, 2f, 12.172f, 2f)
            horizontalLineTo(6f)
            close()
            moveTo(17.379f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(4.621f)
            lineTo(17.379f, 8.5f)
            close()
            moveTo(7.25f, 12.75f)
            curveTo(7.25f, 12.336f, 6.914f, 12f, 6.5f, 12f)
            curveTo(6.086f, 12f, 5.75f, 12.336f, 5.75f, 12.75f)
            verticalLineTo(13.316f)
            curveTo(4.004f, 13.627f, 2.627f, 15.004f, 2.316f, 16.75f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 16.75f, 1f, 17.086f, 1f, 17.5f)
            curveTo(1f, 17.914f, 1.336f, 18.25f, 1.75f, 18.25f)
            horizontalLineTo(2.316f)
            curveTo(2.627f, 19.996f, 4.004f, 21.373f, 5.75f, 21.684f)
            verticalLineTo(22.25f)
            curveTo(5.75f, 22.664f, 6.086f, 23f, 6.5f, 23f)
            curveTo(6.914f, 23f, 7.25f, 22.664f, 7.25f, 22.25f)
            verticalLineTo(21.684f)
            curveTo(8.996f, 21.373f, 10.373f, 19.996f, 10.684f, 18.25f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 18.25f, 12f, 17.914f, 12f, 17.5f)
            curveTo(12f, 17.086f, 11.664f, 16.75f, 11.25f, 16.75f)
            horizontalLineTo(10.684f)
            curveTo(10.373f, 15.004f, 8.996f, 13.627f, 7.25f, 13.316f)
            verticalLineTo(12.75f)
            close()
            moveTo(3.75f, 17.5f)
            curveTo(3.75f, 15.981f, 4.981f, 14.75f, 6.5f, 14.75f)
            curveTo(8.019f, 14.75f, 9.25f, 15.981f, 9.25f, 17.5f)
            curveTo(9.25f, 19.019f, 8.019f, 20.25f, 6.5f, 20.25f)
            curveTo(4.981f, 20.25f, 3.75f, 19.019f, 3.75f, 17.5f)
            close()
            moveTo(7.75f, 17.5f)
            curveTo(7.75f, 18.19f, 7.19f, 18.75f, 6.5f, 18.75f)
            curveTo(5.81f, 18.75f, 5.25f, 18.19f, 5.25f, 17.5f)
            curveTo(5.25f, 16.81f, 5.81f, 16.25f, 6.5f, 16.25f)
            curveTo(7.19f, 16.25f, 7.75f, 16.81f, 7.75f, 17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTargetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentTarget, contentDescription = null)
    }
}
