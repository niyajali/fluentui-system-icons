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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.ArrowBidirectionalUpDown: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ArrowBidirectionalUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.975f, 9.689f)
                curveTo(7.595f, 10.089f, 6.962f, 10.105f, 6.561f, 9.725f)
                curveTo(6.161f, 9.345f, 6.145f, 8.712f, 6.525f, 8.311f)
                lineTo(11.275f, 3.311f)
                curveTo(11.464f, 3.113f, 11.726f, 3f, 12f, 3f)
                curveTo(12.274f, 3f, 12.536f, 3.113f, 12.725f, 3.311f)
                lineTo(17.475f, 8.311f)
                curveTo(17.855f, 8.712f, 17.839f, 9.345f, 17.439f, 9.725f)
                curveTo(17.038f, 10.105f, 16.405f, 10.089f, 16.025f, 9.689f)
                lineTo(13f, 6.505f)
                verticalLineTo(17.496f)
                lineTo(16.025f, 14.311f)
                curveTo(16.405f, 13.911f, 17.038f, 13.895f, 17.439f, 14.275f)
                curveTo(17.839f, 14.655f, 17.855f, 15.288f, 17.475f, 15.689f)
                lineTo(12.725f, 20.689f)
                curveTo(12.536f, 20.888f, 12.274f, 21f, 12f, 21f)
                curveTo(11.726f, 21f, 11.464f, 20.888f, 11.275f, 20.689f)
                lineTo(6.525f, 15.689f)
                curveTo(6.145f, 15.288f, 6.161f, 14.655f, 6.561f, 14.275f)
                curveTo(6.962f, 13.895f, 7.595f, 13.911f, 7.975f, 14.311f)
                lineTo(11f, 17.496f)
                verticalLineTo(6.505f)
                lineTo(7.975f, 9.689f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowBidirectionalUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowBidirectionalUpDown, contentDescription = null)
    }
}
