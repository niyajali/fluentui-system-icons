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

public val FluentIcons.Filled.BoxEdit: ImageVector
    get() {
        if (_BoxEdit != null) {
            return _BoxEdit!!
        }
        _BoxEdit = ImageVector.Builder(
            name = "Filled.BoxEdit",
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
                verticalLineTo(17.606f)
                lineTo(18.393f, 11.963f)
                curveTo(19.368f, 10.988f, 20.804f, 10.754f, 22f, 11.261f)
                verticalLineTo(7.191f)
                close()
                moveTo(11.25f, 10.765f)
                verticalLineTo(20.662f)
                lineTo(11.063f, 21.409f)
                curveTo(11.044f, 21.484f, 11.03f, 21.559f, 11.019f, 21.633f)
                curveTo(10.875f, 21.594f, 10.731f, 21.546f, 10.591f, 21.489f)
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
                moveTo(19.1f, 12.67f)
                lineTo(13.197f, 18.573f)
                curveTo(12.853f, 18.917f, 12.609f, 19.348f, 12.491f, 19.82f)
                lineTo(12.033f, 21.651f)
                curveTo(11.834f, 22.447f, 12.556f, 23.168f, 13.352f, 22.969f)
                lineTo(15.182f, 22.512f)
                curveTo(15.655f, 22.394f, 16.086f, 22.149f, 16.43f, 21.805f)
                lineTo(22.332f, 15.903f)
                curveTo(23.225f, 15.01f, 23.225f, 13.563f, 22.332f, 12.67f)
                curveTo(21.44f, 11.778f, 19.993f, 11.778f, 19.1f, 12.67f)
                close()
            }
        }.build()

        return _BoxEdit!!
    }

@Suppress("ObjectPropertyName")
private var _BoxEdit: ImageVector? = null

@Preview
@Composable
private fun BoxEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BoxEdit, contentDescription = null)
    }
}
