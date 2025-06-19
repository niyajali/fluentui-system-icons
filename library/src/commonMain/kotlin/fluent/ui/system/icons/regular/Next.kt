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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Next: ImageVector
    get() {
        if (_Next != null) {
            return _Next!!
        }
        _Next = ImageVector.Builder(
            name = "Regular.Next",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 4.753f)
                curveTo(3f, 3.345f, 4.578f, 2.514f, 5.739f, 3.309f)
                lineTo(16.238f, 10.503f)
                curveTo(17.248f, 11.195f, 17.253f, 12.684f, 16.248f, 13.383f)
                lineTo(5.749f, 20.685f)
                curveTo(4.589f, 21.492f, 3f, 20.661f, 3f, 19.248f)
                verticalLineTo(4.753f)
                close()
                moveTo(4.891f, 4.547f)
                curveTo(4.726f, 4.433f, 4.5f, 4.552f, 4.5f, 4.753f)
                verticalLineTo(19.248f)
                curveTo(4.5f, 19.45f, 4.727f, 19.569f, 4.893f, 19.453f)
                lineTo(15.391f, 12.152f)
                curveTo(15.535f, 12.052f, 15.534f, 11.839f, 15.39f, 11.74f)
                lineTo(4.891f, 4.547f)
                close()
                moveTo(21f, 3.75f)
                curveTo(21f, 3.336f, 20.664f, 3f, 20.25f, 3f)
                curveTo(19.836f, 3f, 19.5f, 3.336f, 19.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19.5f, 20.664f, 19.836f, 21f, 20.25f, 21f)
                curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }.build()

        return _Next!!
    }

@Suppress("ObjectPropertyName")
private var _Next: ImageVector? = null

@Preview
@Composable
private fun NextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Next, contentDescription = null)
    }
}
