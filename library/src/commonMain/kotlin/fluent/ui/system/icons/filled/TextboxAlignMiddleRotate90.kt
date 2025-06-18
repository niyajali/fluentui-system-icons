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

public val FluentUi.Filled.TextboxAlignMiddleRotate90: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextboxAlignMiddleRotate90",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 5.75f)
            curveTo(21f, 4.231f, 19.769f, 3f, 18.25f, 3f)
            lineTo(5.75f, 3f)
            curveTo(4.231f, 3f, 3f, 4.231f, 3f, 5.75f)
            lineTo(3f, 18.25f)
            curveTo(3f, 19.769f, 4.231f, 21f, 5.75f, 21f)
            horizontalLineTo(18.25f)
            curveTo(19.769f, 21f, 21f, 19.769f, 21f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(15f, 7.25f)
            lineTo(15f, 16.75f)
            curveTo(15f, 17.164f, 14.664f, 17.5f, 14.25f, 17.5f)
            curveTo(13.836f, 17.5f, 13.5f, 17.164f, 13.5f, 16.75f)
            lineTo(13.5f, 7.25f)
            curveTo(13.5f, 6.836f, 13.836f, 6.5f, 14.25f, 6.5f)
            curveTo(14.664f, 6.5f, 15f, 6.836f, 15f, 7.25f)
            close()
            moveTo(11f, 7.25f)
            lineTo(11f, 16.75f)
            curveTo(11f, 17.164f, 10.664f, 17.5f, 10.25f, 17.5f)
            curveTo(9.836f, 17.5f, 9.5f, 17.164f, 9.5f, 16.75f)
            lineTo(9.5f, 7.25f)
            curveTo(9.5f, 6.836f, 9.836f, 6.5f, 10.25f, 6.5f)
            curveTo(10.664f, 6.5f, 11f, 6.836f, 11f, 7.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextboxAlignMiddleRotate90Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextboxAlignMiddleRotate90, contentDescription = null)
    }
}
