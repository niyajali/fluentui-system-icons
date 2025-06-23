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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowSplit: ImageVector
    get() {
        if (_ArrowSplit != null) {
            return _ArrowSplit!!
        }
        _ArrowSplit = ImageVector.Builder(
            name = "Regular.ArrowSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.001f, 3f)
                curveTo(12.415f, 3f, 12.751f, 3.336f, 12.751f, 3.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(15.246f)
                curveTo(16.765f, 9.5f, 17.996f, 10.731f, 17.996f, 12.25f)
                verticalLineTo(18.442f)
                lineTo(19.721f, 16.719f)
                curveTo(20.014f, 16.427f, 20.489f, 16.427f, 20.781f, 16.72f)
                curveTo(21.074f, 17.013f, 21.074f, 17.488f, 20.781f, 17.781f)
                lineTo(17.776f, 20.781f)
                curveTo(17.483f, 21.074f, 17.008f, 21.074f, 16.716f, 20.781f)
                lineTo(13.715f, 17.78f)
                curveTo(13.422f, 17.487f, 13.422f, 17.013f, 13.715f, 16.72f)
                curveTo(14.008f, 16.427f, 14.483f, 16.427f, 14.776f, 16.72f)
                lineTo(16.496f, 18.44f)
                verticalLineTo(12.25f)
                curveTo(16.496f, 11.56f, 15.936f, 11f, 15.246f, 11f)
                horizontalLineTo(8.751f)
                curveTo(8.06f, 11f, 7.501f, 11.56f, 7.501f, 12.25f)
                verticalLineTo(18.44f)
                lineTo(9.221f, 16.72f)
                curveTo(9.514f, 16.427f, 9.989f, 16.427f, 10.281f, 16.72f)
                curveTo(10.574f, 17.013f, 10.574f, 17.487f, 10.281f, 17.78f)
                lineTo(7.281f, 20.781f)
                curveTo(6.988f, 21.074f, 6.513f, 21.074f, 6.22f, 20.781f)
                lineTo(3.22f, 17.78f)
                curveTo(2.927f, 17.487f, 2.927f, 17.013f, 3.22f, 16.72f)
                curveTo(3.513f, 16.427f, 3.987f, 16.427f, 4.28f, 16.72f)
                lineTo(6.001f, 18.44f)
                verticalLineTo(12.25f)
                curveTo(6.001f, 10.731f, 7.232f, 9.5f, 8.751f, 9.5f)
                horizontalLineTo(11.251f)
                verticalLineTo(3.75f)
                curveTo(11.251f, 3.336f, 11.586f, 3f, 12.001f, 3f)
                close()
            }
        }.build()

        return _ArrowSplit!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSplit: ImageVector? = null

@Preview
@Composable
private fun ArrowSplitPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowSplit, contentDescription = null)
    }
}
