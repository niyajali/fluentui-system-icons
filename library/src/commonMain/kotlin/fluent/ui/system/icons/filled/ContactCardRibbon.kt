/*
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

public val FluentIcons.Filled.ContactCardRibbon: ImageVector
    get() {
        if (_ContactCardRibbon != null) {
            return _ContactCardRibbon!!
        }
        _ContactCardRibbon = ImageVector.Builder(
            name = "Filled.ContactCardRibbon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.75f, 4f)
                curveTo(20.993f, 4f, 22f, 5.007f, 22f, 6.25f)
                verticalLineTo(11.758f)
                curveTo(21.285f, 11.279f, 20.425f, 11f, 19.5f, 11f)
                curveTo(17.941f, 11f, 16.568f, 11.792f, 15.76f, 12.996f)
                horizontalLineTo(13.252f)
                lineTo(13.151f, 13.003f)
                curveTo(12.784f, 13.053f, 12.502f, 13.366f, 12.502f, 13.746f)
                curveTo(12.502f, 14.126f, 12.784f, 14.44f, 13.151f, 14.489f)
                lineTo(13.252f, 14.496f)
                horizontalLineTo(15.112f)
                curveTo(15.039f, 14.819f, 15f, 15.155f, 15f, 15.5f)
                curveTo(15f, 16.572f, 15.375f, 17.556f, 16f, 18.329f)
                verticalLineTo(20.005f)
                horizontalLineTo(4.25f)
                curveTo(3.007f, 20.005f, 2f, 18.997f, 2f, 17.755f)
                verticalLineTo(6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                horizontalLineTo(19.75f)
                close()
                moveTo(6.25f, 12.5f)
                curveTo(5.87f, 12.5f, 5.557f, 12.782f, 5.507f, 13.148f)
                lineTo(5.5f, 13.25f)
                verticalLineTo(13.742f)
                lineTo(5.508f, 13.85f)
                curveTo(5.67f, 14.964f, 6.602f, 15.501f, 8f, 15.501f)
                curveTo(9.331f, 15.501f, 10.24f, 15.014f, 10.464f, 14.006f)
                lineTo(10.492f, 13.851f)
                lineTo(10.5f, 13.743f)
                verticalLineTo(13.25f)
                curveTo(10.5f, 12.87f, 10.218f, 12.557f, 9.852f, 12.507f)
                lineTo(9.75f, 12.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(8f, 8.502f)
                curveTo(7.172f, 8.502f, 6.5f, 9.174f, 6.5f, 10.002f)
                curveTo(6.5f, 10.831f, 7.172f, 11.502f, 8f, 11.502f)
                curveTo(8.828f, 11.502f, 9.5f, 10.831f, 9.5f, 10.002f)
                curveTo(9.5f, 9.174f, 8.828f, 8.502f, 8f, 8.502f)
                close()
                moveTo(17.75f, 9.5f)
                horizontalLineTo(13.252f)
                lineTo(13.151f, 9.507f)
                curveTo(12.784f, 9.557f, 12.502f, 9.87f, 12.502f, 10.25f)
                curveTo(12.502f, 10.63f, 12.784f, 10.943f, 13.151f, 10.993f)
                lineTo(13.252f, 11f)
                horizontalLineTo(17.75f)
                lineTo(17.852f, 10.993f)
                curveTo(18.218f, 10.943f, 18.5f, 10.63f, 18.5f, 10.25f)
                curveTo(18.5f, 9.87f, 18.218f, 9.557f, 17.852f, 9.507f)
                lineTo(17.75f, 9.5f)
                close()
                moveTo(23f, 15.5f)
                curveTo(23f, 17.433f, 21.433f, 19f, 19.5f, 19f)
                curveTo(17.567f, 19f, 16f, 17.433f, 16f, 15.5f)
                curveTo(16f, 13.567f, 17.567f, 12f, 19.5f, 12f)
                curveTo(21.433f, 12f, 23f, 13.567f, 23f, 15.5f)
                close()
                moveTo(17f, 19.242f)
                verticalLineTo(22.286f)
                curveTo(17f, 22.918f, 17.765f, 23.235f, 18.212f, 22.788f)
                lineTo(19.5f, 21.5f)
                lineTo(20.788f, 22.788f)
                curveTo(21.235f, 23.235f, 22f, 22.918f, 22f, 22.286f)
                verticalLineTo(19.242f)
                curveTo(21.285f, 19.721f, 20.425f, 20f, 19.5f, 20f)
                curveTo(18.575f, 20f, 17.715f, 19.721f, 17f, 19.242f)
                close()
            }
        }.build()

        return _ContactCardRibbon!!
    }

@Suppress("ObjectPropertyName")
private var _ContactCardRibbon: ImageVector? = null

@Preview
@Composable
private fun ContactCardRibbonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ContactCardRibbon, contentDescription = null)
    }
}
