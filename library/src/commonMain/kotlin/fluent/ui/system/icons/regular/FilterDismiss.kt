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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.FilterDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FilterDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(23f, 7.5f)
            curveTo(23f, 10.538f, 20.538f, 13f, 17.5f, 13f)
            curveTo(14.462f, 13f, 12f, 10.538f, 12f, 7.5f)
            curveTo(12f, 4.462f, 14.462f, 2f, 17.5f, 2f)
            curveTo(20.538f, 2f, 23f, 4.462f, 23f, 7.5f)
            close()
            moveTo(15.854f, 5.146f)
            curveTo(15.658f, 4.951f, 15.342f, 4.951f, 15.146f, 5.146f)
            curveTo(14.951f, 5.342f, 14.951f, 5.658f, 15.146f, 5.854f)
            lineTo(16.793f, 7.5f)
            lineTo(15.146f, 9.146f)
            curveTo(14.951f, 9.342f, 14.951f, 9.658f, 15.146f, 9.854f)
            curveTo(15.342f, 10.049f, 15.658f, 10.049f, 15.854f, 9.854f)
            lineTo(17.5f, 8.207f)
            lineTo(19.146f, 9.854f)
            curveTo(19.342f, 10.049f, 19.658f, 10.049f, 19.854f, 9.854f)
            curveTo(20.049f, 9.658f, 20.049f, 9.342f, 19.854f, 9.146f)
            lineTo(18.207f, 7.5f)
            lineTo(19.854f, 5.854f)
            curveTo(20.049f, 5.658f, 20.049f, 5.342f, 19.854f, 5.146f)
            curveTo(19.658f, 4.951f, 19.342f, 4.951f, 19.146f, 5.146f)
            lineTo(17.5f, 6.793f)
            lineTo(15.854f, 5.146f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.346f, 12.5f)
            curveTo(12.832f, 12.072f, 12.384f, 11.566f, 12.022f, 11f)
            horizontalLineTo(7.5f)
            curveTo(7.086f, 11f, 6.75f, 11.336f, 6.75f, 11.75f)
            curveTo(6.75f, 12.164f, 7.086f, 12.5f, 7.5f, 12.5f)
            horizontalLineTo(13.346f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11f, 7.5f)
            curveTo(11f, 6.984f, 11.06f, 6.482f, 11.174f, 6f)
            horizontalLineTo(4.5f)
            curveTo(4.086f, 6f, 3.75f, 6.336f, 3.75f, 6.75f)
            curveTo(3.75f, 7.164f, 4.086f, 7.5f, 4.5f, 7.5f)
            horizontalLineTo(11f)
            close()
        }
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.5f, 16f)
            curveTo(13.914f, 16f, 14.25f, 16.336f, 14.25f, 16.75f)
            curveTo(14.25f, 17.164f, 13.914f, 17.5f, 13.5f, 17.5f)
            horizontalLineTo(10.5f)
            curveTo(10.086f, 17.5f, 9.75f, 17.164f, 9.75f, 16.75f)
            curveTo(9.75f, 16.336f, 10.086f, 16f, 10.5f, 16f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FilterDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FilterDismiss, contentDescription = null)
    }
}
