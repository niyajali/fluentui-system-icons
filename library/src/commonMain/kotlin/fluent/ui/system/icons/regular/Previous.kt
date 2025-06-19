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

public val FluentIcons.Regular.Previous: ImageVector
    get() {
        if (_Previous != null) {
            return _Previous!!
        }
        _Previous = ImageVector.Builder(
            name = "Regular.Previous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21f, 4.753f)
                curveTo(21f, 3.345f, 19.422f, 2.514f, 18.261f, 3.309f)
                lineTo(7.762f, 10.503f)
                curveTo(6.752f, 11.195f, 6.747f, 12.684f, 7.752f, 13.383f)
                lineTo(18.251f, 20.685f)
                curveTo(19.411f, 21.492f, 21f, 20.661f, 21f, 19.248f)
                verticalLineTo(4.753f)
                close()
                moveTo(19.109f, 4.547f)
                curveTo(19.274f, 4.433f, 19.5f, 4.552f, 19.5f, 4.753f)
                verticalLineTo(19.248f)
                curveTo(19.5f, 19.45f, 19.273f, 19.569f, 19.107f, 19.453f)
                lineTo(8.609f, 12.152f)
                curveTo(8.465f, 12.052f, 8.466f, 11.839f, 8.61f, 11.74f)
                lineTo(19.109f, 4.547f)
                close()
                moveTo(3f, 3.75f)
                curveTo(3f, 3.336f, 3.336f, 3f, 3.75f, 3f)
                curveTo(4.164f, 3f, 4.5f, 3.336f, 4.5f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(4.5f, 20.664f, 4.164f, 21f, 3.75f, 21f)
                curveTo(3.336f, 21f, 3f, 20.664f, 3f, 20.25f)
                verticalLineTo(3.75f)
                close()
            }
        }.build()

        return _Previous!!
    }

@Suppress("ObjectPropertyName")
private var _Previous: ImageVector? = null

@Preview
@Composable
private fun PreviousPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Previous, contentDescription = null)
    }
}
