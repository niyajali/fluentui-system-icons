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

public val FluentIcons.Filled.BoxDismiss: ImageVector
    get() {
        if (_BoxDismiss != null) {
            return _BoxDismiss!!
        }
        _BoxDismiss = ImageVector.Builder(
            name = "Filled.BoxDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.409f, 2.513f)
                curveTo(12.505f, 2.147f, 11.495f, 2.147f, 10.591f, 2.513f)
                lineTo(8.401f, 3.401f)
                lineTo(17.993f, 7.131f)
                lineTo(21.367f, 5.828f)
                curveTo(21.231f, 5.715f, 21.077f, 5.622f, 20.907f, 5.553f)
                lineTo(13.409f, 2.513f)
                close()
                moveTo(22f, 7.191f)
                lineTo(12.75f, 10.765f)
                verticalLineTo(13.064f)
                curveTo(13.936f, 11.795f, 15.625f, 11.001f, 17.5f, 11.001f)
                curveTo(19.247f, 11.001f, 20.832f, 11.69f, 22f, 12.811f)
                verticalLineTo(7.191f)
                close()
                moveTo(11.25f, 10.765f)
                verticalLineTo(15.71f)
                curveTo(11.087f, 16.279f, 11f, 16.88f, 11f, 17.501f)
                curveTo(11f, 18.122f, 11.087f, 18.723f, 11.25f, 19.292f)
                verticalLineTo(21.688f)
                curveTo(11.026f, 21.642f, 10.806f, 21.576f, 10.591f, 21.489f)
                lineTo(3.093f, 18.449f)
                curveTo(2.432f, 18.181f, 2f, 17.54f, 2f, 16.827f)
                verticalLineTo(7.191f)
                lineTo(11.25f, 10.765f)
                close()
                moveTo(2.633f, 5.828f)
                lineTo(12f, 9.447f)
                lineTo(15.917f, 7.933f)
                lineTo(6.374f, 4.223f)
                lineTo(3.093f, 5.553f)
                curveTo(2.923f, 5.622f, 2.769f, 5.715f, 2.633f, 5.828f)
                close()
                moveTo(23f, 17.501f)
                curveTo(23f, 20.538f, 20.538f, 23.001f, 17.5f, 23.001f)
                curveTo(14.462f, 23.001f, 12f, 20.538f, 12f, 17.501f)
                curveTo(12f, 14.463f, 14.462f, 12.001f, 17.5f, 12.001f)
                curveTo(20.538f, 12.001f, 23f, 14.463f, 23f, 17.501f)
                close()
                moveTo(15.854f, 15.147f)
                curveTo(15.658f, 14.952f, 15.342f, 14.952f, 15.146f, 15.147f)
                curveTo(14.951f, 15.343f, 14.951f, 15.659f, 15.146f, 15.854f)
                lineTo(16.793f, 17.501f)
                lineTo(15.146f, 19.147f)
                curveTo(14.951f, 19.343f, 14.951f, 19.659f, 15.146f, 19.854f)
                curveTo(15.342f, 20.05f, 15.658f, 20.05f, 15.854f, 19.854f)
                lineTo(17.5f, 18.208f)
                lineTo(19.146f, 19.854f)
                curveTo(19.342f, 20.05f, 19.658f, 20.05f, 19.854f, 19.854f)
                curveTo(20.049f, 19.659f, 20.049f, 19.343f, 19.854f, 19.147f)
                lineTo(18.207f, 17.501f)
                lineTo(19.854f, 15.854f)
                curveTo(20.049f, 15.659f, 20.049f, 15.343f, 19.854f, 15.147f)
                curveTo(19.658f, 14.952f, 19.342f, 14.952f, 19.146f, 15.147f)
                lineTo(17.5f, 16.794f)
                lineTo(15.854f, 15.147f)
                close()
            }
        }.build()

        return _BoxDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _BoxDismiss: ImageVector? = null

@Preview
@Composable
private fun BoxDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BoxDismiss, contentDescription = null)
    }
}
