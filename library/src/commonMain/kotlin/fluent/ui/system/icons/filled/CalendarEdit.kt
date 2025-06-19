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

public val FluentIcons.Filled.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "Filled.CalendarEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.164f, 20.998f)
                lineTo(11.52f, 19.575f)
                curveTo(11.682f, 18.927f, 12.017f, 18.336f, 12.489f, 17.864f)
                lineTo(18.391f, 11.962f)
                curveTo(19.105f, 11.248f, 20.066f, 10.931f, 20.998f, 11.012f)
                verticalLineTo(8.5f)
                horizontalLineTo(3f)
                verticalLineTo(17.749f)
                curveTo(3f, 19.544f, 4.455f, 20.998f, 6.25f, 20.998f)
                horizontalLineTo(11.164f)
                close()
                moveTo(6f, 16.25f)
                curveTo(6f, 15.56f, 6.56f, 15f, 7.25f, 15f)
                curveTo(7.94f, 15f, 8.5f, 15.56f, 8.5f, 16.25f)
                curveTo(8.5f, 16.94f, 7.94f, 17.5f, 7.25f, 17.5f)
                curveTo(6.56f, 17.5f, 6f, 16.94f, 6f, 16.25f)
                close()
                moveTo(10.75f, 16.25f)
                curveTo(10.75f, 15.56f, 11.31f, 15f, 12f, 15f)
                curveTo(12.69f, 15f, 13.25f, 15.56f, 13.25f, 16.25f)
                curveTo(13.25f, 16.94f, 12.69f, 17.5f, 12f, 17.5f)
                curveTo(11.31f, 17.5f, 10.75f, 16.94f, 10.75f, 16.25f)
                close()
                moveTo(6f, 11.75f)
                curveTo(6f, 11.06f, 6.56f, 10.5f, 7.25f, 10.5f)
                curveTo(7.94f, 10.5f, 8.5f, 11.06f, 8.5f, 11.75f)
                curveTo(8.5f, 12.44f, 7.94f, 13f, 7.25f, 13f)
                curveTo(6.56f, 13f, 6f, 12.44f, 6f, 11.75f)
                close()
                moveTo(10.75f, 11.75f)
                curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
                curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
                curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
                curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
                close()
                moveTo(15.5f, 11.75f)
                curveTo(15.5f, 11.06f, 16.06f, 10.5f, 16.75f, 10.5f)
                curveTo(17.44f, 10.5f, 18f, 11.06f, 18f, 11.75f)
                curveTo(18f, 12.44f, 17.44f, 13f, 16.75f, 13f)
                curveTo(16.06f, 13f, 15.5f, 12.44f, 15.5f, 11.75f)
                close()
                moveTo(17.749f, 3f)
                curveTo(19.544f, 3f, 20.998f, 4.455f, 20.998f, 6.25f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.749f)
                close()
                moveTo(13.196f, 18.57f)
                lineTo(19.098f, 12.669f)
                curveTo(19.991f, 11.776f, 21.438f, 11.776f, 22.331f, 12.669f)
                curveTo(23.223f, 13.561f, 23.223f, 15.008f, 22.331f, 15.901f)
                lineTo(16.429f, 21.803f)
                curveTo(16.085f, 22.147f, 15.653f, 22.391f, 15.181f, 22.509f)
                lineTo(13.351f, 22.967f)
                curveTo(12.555f, 23.166f, 11.834f, 22.444f, 12.033f, 21.648f)
                lineTo(12.49f, 19.818f)
                curveTo(12.608f, 19.346f, 12.852f, 18.915f, 13.196f, 18.57f)
                close()
            }
        }.build()

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null

@Preview
@Composable
private fun CalendarEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CalendarEdit, contentDescription = null)
    }
}
