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

public val FluentUi.Filled.DocumentText: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentText",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 8f)
            verticalLineTo(2f)
            horizontalLineTo(6f)
            curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
            verticalLineTo(20f)
            curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
            horizontalLineTo(18f)
            curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
            verticalLineTo(10f)
            horizontalLineTo(14f)
            curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
            close()
            moveTo(8.25f, 11.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 11.5f, 16.5f, 11.836f, 16.5f, 12.25f)
            curveTo(16.5f, 12.664f, 16.164f, 13f, 15.75f, 13f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 13f, 7.5f, 12.664f, 7.5f, 12.25f)
            curveTo(7.5f, 11.836f, 7.836f, 11.5f, 8.25f, 11.5f)
            close()
            moveTo(8.25f, 14.25f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 14.25f, 16.5f, 14.586f, 16.5f, 15f)
            curveTo(16.5f, 15.414f, 16.164f, 15.75f, 15.75f, 15.75f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 15.75f, 7.5f, 15.414f, 7.5f, 15f)
            curveTo(7.5f, 14.586f, 7.836f, 14.25f, 8.25f, 14.25f)
            close()
            moveTo(8.25f, 17f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 17f, 16.5f, 17.336f, 16.5f, 17.75f)
            curveTo(16.5f, 18.164f, 16.164f, 18.5f, 15.75f, 18.5f)
            horizontalLineTo(8.25f)
            curveTo(7.836f, 18.5f, 7.5f, 18.164f, 7.5f, 17.75f)
            curveTo(7.5f, 17.336f, 7.836f, 17f, 8.25f, 17f)
            close()
            moveTo(13.5f, 8f)
            verticalLineTo(2.5f)
            lineTo(19.5f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentTextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentText, contentDescription = null)
    }
}
