package fluent.ui.system.icons.filled

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

public val FluentIcons.Filled.Merge: ImageVector
    get() {
        if (_Merge != null) {
            return _Merge!!
        }
        _Merge = ImageVector.Builder(
            name = "Filled.Merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 7f)
                curveTo(3f, 6.448f, 3.448f, 6f, 4f, 6f)
                horizontalLineTo(6.757f)
                curveTo(7.818f, 6f, 8.836f, 6.421f, 9.586f, 7.172f)
                lineTo(12.535f, 10.121f)
                curveTo(13.098f, 10.684f, 13.861f, 11f, 14.657f, 11f)
                horizontalLineTo(18.584f)
                lineTo(15.293f, 7.711f)
                curveTo(14.903f, 7.321f, 14.902f, 6.688f, 15.293f, 6.297f)
                curveTo(15.683f, 5.906f, 16.316f, 5.906f, 16.707f, 6.297f)
                lineTo(21.707f, 11.293f)
                curveTo(21.895f, 11.48f, 22f, 11.735f, 22f, 12f)
                curveTo(22f, 12.265f, 21.895f, 12.52f, 21.707f, 12.707f)
                lineTo(16.707f, 17.707f)
                curveTo(16.317f, 18.098f, 15.683f, 18.098f, 15.293f, 17.707f)
                curveTo(14.902f, 17.317f, 14.902f, 16.684f, 15.293f, 16.293f)
                lineTo(18.586f, 13f)
                horizontalLineTo(14.617f)
                curveTo(13.836f, 13.01f, 13.089f, 13.325f, 12.535f, 13.879f)
                lineTo(9.586f, 16.828f)
                curveTo(8.836f, 17.579f, 7.818f, 18f, 6.757f, 18f)
                horizontalLineTo(4f)
                curveTo(3.448f, 18f, 3f, 17.552f, 3f, 17f)
                curveTo(3f, 16.448f, 3.448f, 16f, 4f, 16f)
                horizontalLineTo(6.757f)
                curveTo(7.288f, 16f, 7.797f, 15.789f, 8.172f, 15.414f)
                lineTo(11.121f, 12.465f)
                curveTo(11.29f, 12.296f, 11.469f, 12.141f, 11.657f, 12f)
                curveTo(11.469f, 11.859f, 11.29f, 11.704f, 11.121f, 11.535f)
                lineTo(8.172f, 8.586f)
                curveTo(7.797f, 8.211f, 7.288f, 8f, 6.757f, 8f)
                horizontalLineTo(4f)
                curveTo(3.448f, 8f, 3f, 7.552f, 3f, 7f)
                close()
            }
        }.build()

        return _Merge!!
    }

@Suppress("ObjectPropertyName")
private var _Merge: ImageVector? = null

@Preview
@Composable
private fun MergePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Merge, contentDescription = null)
    }
}
