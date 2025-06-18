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

public val FluentUi.Filled.TextboxAlignBottomCenter: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignBottomCenter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            verticalLineTo(18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            horizontalLineTo(5.75f)
            close()
            moveTo(7.25f, 11.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 11.5f, 17.5f, 11.836f, 17.5f, 12.25f)
            curveTo(17.5f, 12.664f, 17.164f, 13f, 16.75f, 13f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 13f, 6.5f, 12.664f, 6.5f, 12.25f)
            curveTo(6.5f, 11.836f, 6.836f, 11.5f, 7.25f, 11.5f)
            close()
            moveTo(9.25f, 15.5f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 15.5f, 15.5f, 15.836f, 15.5f, 16.25f)
            curveTo(15.5f, 16.664f, 15.164f, 17f, 14.75f, 17f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 17f, 8.5f, 16.664f, 8.5f, 16.25f)
            curveTo(8.5f, 15.836f, 8.836f, 15.5f, 9.25f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextboxAlignBottomCenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextboxAlignBottomCenter, contentDescription = null)
    }
}
