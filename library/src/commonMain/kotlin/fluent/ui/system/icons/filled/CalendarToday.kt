/**
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentUi.Filled.CalendarToday: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarToday",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.25f, 11.75f)
            curveTo(13.25f, 12.44f, 12.69f, 13f, 12f, 13f)
            curveTo(11.31f, 13f, 10.75f, 12.44f, 10.75f, 11.75f)
            curveTo(10.75f, 11.06f, 11.31f, 10.5f, 12f, 10.5f)
            curveTo(12.69f, 10.5f, 13.25f, 11.06f, 13.25f, 11.75f)
            close()
            moveTo(21f, 8.5f)
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(13.75f)
            curveTo(13.75f, 21f, 13.75f, 20.518f, 13.75f, 20.25f)
            verticalLineTo(19.427f)
            curveTo(14.381f, 19.615f, 15.092f, 19.437f, 15.558f, 18.913f)
            curveTo(16.2f, 18.19f, 16.135f, 17.084f, 15.413f, 16.442f)
            lineTo(13.163f, 14.442f)
            curveTo(12.5f, 13.853f, 11.5f, 13.853f, 10.837f, 14.442f)
            lineTo(8.587f, 16.442f)
            curveTo(7.865f, 17.084f, 7.8f, 18.19f, 8.442f, 18.913f)
            curveTo(8.908f, 19.437f, 9.619f, 19.615f, 10.25f, 19.427f)
            verticalLineTo(20.25f)
            curveTo(10.25f, 20.518f, 10.25f, 21f, 10.25f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(21f)
            close()
            moveTo(12f, 14f)
            curveTo(13.243f, 14f, 14.25f, 12.993f, 14.25f, 11.75f)
            curveTo(14.25f, 10.507f, 13.243f, 9.5f, 12f, 9.5f)
            curveTo(10.757f, 9.5f, 9.75f, 10.507f, 9.75f, 11.75f)
            curveTo(9.75f, 12.993f, 10.757f, 14f, 12f, 14f)
            close()
            moveTo(17.75f, 3f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            close()
            moveTo(14.811f, 18.248f)
            curveTo(14.535f, 18.558f, 14.061f, 18.586f, 13.752f, 18.311f)
            lineTo(12.75f, 17.42f)
            verticalLineTo(21.25f)
            curveTo(12.75f, 21.664f, 12.414f, 22f, 12f, 22f)
            curveTo(11.586f, 22f, 11.25f, 21.664f, 11.25f, 21.25f)
            verticalLineTo(17.42f)
            lineTo(10.248f, 18.311f)
            curveTo(9.939f, 18.586f, 9.465f, 18.558f, 9.189f, 18.248f)
            curveTo(8.914f, 17.939f, 8.942f, 17.465f, 9.252f, 17.189f)
            lineTo(11.502f, 15.189f)
            curveTo(11.786f, 14.937f, 12.214f, 14.937f, 12.498f, 15.189f)
            lineTo(14.748f, 17.189f)
            curveTo(15.058f, 17.465f, 15.086f, 17.939f, 14.811f, 18.248f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarTodayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CalendarToday, contentDescription = null)
    }
}
