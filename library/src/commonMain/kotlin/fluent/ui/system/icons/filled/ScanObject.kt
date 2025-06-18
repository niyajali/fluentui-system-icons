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

public val FluentUi.Filled.ScanObject: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ScanObject",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.5f, 5.25f)
            curveTo(3.5f, 4.284f, 4.284f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 3.5f, 9f, 3.164f, 9f, 2.75f)
            curveTo(9f, 2.336f, 8.664f, 2f, 8.25f, 2f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(2f, 8.664f, 2.336f, 9f, 2.75f, 9f)
            curveTo(3.164f, 9f, 3.5f, 8.664f, 3.5f, 8.25f)
            verticalLineTo(5.25f)
            close()
            moveTo(3.5f, 18.75f)
            curveTo(3.5f, 19.716f, 4.284f, 20.5f, 5.25f, 20.5f)
            horizontalLineTo(8.25f)
            curveTo(8.664f, 20.5f, 9f, 20.836f, 9f, 21.25f)
            curveTo(9f, 21.664f, 8.664f, 22f, 8.25f, 22f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(2f, 15.336f, 2.336f, 15f, 2.75f, 15f)
            curveTo(3.164f, 15f, 3.5f, 15.336f, 3.5f, 15.75f)
            verticalLineTo(18.75f)
            close()
            moveTo(18.75f, 3.5f)
            curveTo(19.716f, 3.5f, 20.5f, 4.284f, 20.5f, 5.25f)
            verticalLineTo(8.25f)
            curveTo(20.5f, 8.664f, 20.836f, 9f, 21.25f, 9f)
            curveTo(21.664f, 9f, 22f, 8.664f, 22f, 8.25f)
            verticalLineTo(5.25f)
            curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 2f, 15f, 2.336f, 15f, 2.75f)
            curveTo(15f, 3.164f, 15.336f, 3.5f, 15.75f, 3.5f)
            horizontalLineTo(18.75f)
            close()
            moveTo(20.5f, 18.75f)
            curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
            horizontalLineTo(15.75f)
            curveTo(15.336f, 20.5f, 15f, 20.836f, 15f, 21.25f)
            curveTo(15f, 21.664f, 15.336f, 22f, 15.75f, 22f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
            verticalLineTo(15.75f)
            curveTo(22f, 15.336f, 21.664f, 15f, 21.25f, 15f)
            curveTo(20.836f, 15f, 20.5f, 15.336f, 20.5f, 15.75f)
            verticalLineTo(18.75f)
            close()
            moveTo(13.819f, 8.227f)
            curveTo(12.921f, 6.991f, 11.079f, 6.991f, 10.18f, 8.227f)
            lineTo(7.126f, 12.427f)
            curveTo(6.044f, 13.914f, 7.107f, 16f, 8.945f, 16f)
            horizontalLineTo(15.054f)
            curveTo(16.893f, 16f, 17.955f, 13.914f, 16.874f, 12.427f)
            lineTo(13.819f, 8.227f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ScanObjectPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ScanObject, contentDescription = null)
    }
}
