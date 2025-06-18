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

public val FluentUi.Regular.ArrowExportUp: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExportUp",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12.28f, 2.22f)
            curveTo(11.987f, 1.927f, 11.513f, 1.927f, 11.22f, 2.22f)
            lineTo(6.22f, 7.22f)
            curveTo(5.927f, 7.513f, 5.927f, 7.987f, 6.22f, 8.28f)
            curveTo(6.513f, 8.573f, 6.987f, 8.573f, 7.28f, 8.28f)
            lineTo(11f, 4.561f)
            verticalLineTo(18.25f)
            curveTo(11f, 18.664f, 11.336f, 19f, 11.75f, 19f)
            curveTo(12.164f, 19f, 12.5f, 18.664f, 12.5f, 18.25f)
            verticalLineTo(4.561f)
            lineTo(16.22f, 8.28f)
            curveTo(16.513f, 8.573f, 16.987f, 8.573f, 17.28f, 8.28f)
            curveTo(17.573f, 7.987f, 17.573f, 7.513f, 17.28f, 7.22f)
            lineTo(12.28f, 2.22f)
            close()
            moveTo(5.25f, 20.5f)
            curveTo(4.836f, 20.5f, 4.5f, 20.836f, 4.5f, 21.25f)
            curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 22f, 19f, 21.664f, 19f, 21.25f)
            curveTo(19f, 20.836f, 18.664f, 20.5f, 18.25f, 20.5f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowExportUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowExportUp, contentDescription = null)
    }
}
