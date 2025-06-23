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

public val FluentIcons.Filled.ApprovalsApp: ImageVector
    get() {
        if (_ApprovalsApp != null) {
            return _ApprovalsApp!!
        }
        _ApprovalsApp = ImageVector.Builder(
            name = "Filled.ApprovalsApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.543f, 1.793f)
                curveTo(10.933f, 1.402f, 11.567f, 1.402f, 11.957f, 1.793f)
                lineTo(14.457f, 4.293f)
                curveTo(14.644f, 4.48f, 14.75f, 4.735f, 14.75f, 5f)
                curveTo(14.75f, 5.265f, 14.644f, 5.519f, 14.457f, 5.707f)
                lineTo(11.957f, 8.207f)
                curveTo(11.567f, 8.597f, 10.933f, 8.597f, 10.543f, 8.207f)
                curveTo(10.152f, 7.816f, 10.152f, 7.183f, 10.543f, 6.793f)
                lineTo(11.301f, 6.034f)
                curveTo(7.763f, 6.385f, 5f, 9.37f, 5f, 13f)
                curveTo(5f, 16.866f, 8.134f, 20f, 12f, 20f)
                curveTo(15.569f, 20f, 18.515f, 17.328f, 18.946f, 13.876f)
                curveTo(19.014f, 13.328f, 19.514f, 12.939f, 20.062f, 13.008f)
                curveTo(20.61f, 13.076f, 20.999f, 13.576f, 20.93f, 14.124f)
                curveTo(20.377f, 18.564f, 16.59f, 22f, 12f, 22f)
                curveTo(7.029f, 22f, 3f, 17.971f, 3f, 13f)
                curveTo(3f, 8.245f, 6.687f, 4.352f, 11.358f, 4.023f)
                lineTo(10.543f, 3.207f)
                curveTo(10.152f, 2.817f, 10.152f, 2.183f, 10.543f, 1.793f)
                close()
                moveTo(16.207f, 9.793f)
                curveTo(16.598f, 10.183f, 16.598f, 10.817f, 16.207f, 11.207f)
                lineTo(11.707f, 15.707f)
                curveTo(11.317f, 16.098f, 10.683f, 16.098f, 10.293f, 15.707f)
                lineTo(8.293f, 13.707f)
                curveTo(7.902f, 13.317f, 7.902f, 12.683f, 8.293f, 12.293f)
                curveTo(8.683f, 11.902f, 9.317f, 11.902f, 9.707f, 12.293f)
                lineTo(11f, 13.586f)
                lineTo(14.793f, 9.793f)
                curveTo(15.183f, 9.402f, 15.817f, 9.402f, 16.207f, 9.793f)
                close()
            }
        }.build()

        return _ApprovalsApp!!
    }

@Suppress("ObjectPropertyName")
private var _ApprovalsApp: ImageVector? = null

@Preview
@Composable
private fun ApprovalsAppPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ApprovalsApp, contentDescription = null)
    }
}
