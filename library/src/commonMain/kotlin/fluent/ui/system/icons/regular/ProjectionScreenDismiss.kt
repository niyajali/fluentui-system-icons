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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.ProjectionScreenDismiss: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.ProjectionScreenDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(23f, 6.5f)
                curveTo(23f, 9.538f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 9.538f, 12f, 6.5f)
                curveTo(12f, 3.462f, 14.462f, 1f, 17.5f, 1f)
                curveTo(20.538f, 1f, 23f, 3.462f, 23f, 6.5f)
                close()
                moveTo(15.854f, 4.146f)
                curveTo(15.658f, 3.951f, 15.342f, 3.951f, 15.146f, 4.146f)
                curveTo(14.951f, 4.342f, 14.951f, 4.658f, 15.146f, 4.854f)
                lineTo(16.793f, 6.5f)
                lineTo(15.146f, 8.146f)
                curveTo(14.951f, 8.342f, 14.951f, 8.658f, 15.146f, 8.854f)
                curveTo(15.342f, 9.049f, 15.658f, 9.049f, 15.854f, 8.854f)
                lineTo(17.5f, 7.207f)
                lineTo(19.146f, 8.854f)
                curveTo(19.342f, 9.049f, 19.658f, 9.049f, 19.854f, 8.854f)
                curveTo(20.049f, 8.658f, 20.049f, 8.342f, 19.854f, 8.146f)
                lineTo(18.207f, 6.5f)
                lineTo(19.854f, 4.854f)
                curveTo(20.049f, 4.658f, 20.049f, 4.342f, 19.854f, 4.146f)
                curveTo(19.658f, 3.951f, 19.342f, 3.951f, 19.146f, 4.146f)
                lineTo(17.5f, 5.793f)
                lineTo(15.854f, 4.146f)
                close()
                moveTo(19.5f, 13.25f)
                verticalLineTo(12.686f)
                curveTo(20.034f, 12.514f, 20.537f, 12.275f, 21f, 11.978f)
                verticalLineTo(13.25f)
                curveTo(21f, 15.321f, 19.321f, 17f, 17.25f, 17f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 19.5f, 17f, 19.836f, 17f, 20.25f)
                curveTo(17f, 20.664f, 16.664f, 21f, 16.25f, 21f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 21f, 7f, 20.664f, 7f, 20.25f)
                curveTo(7f, 19.836f, 7.336f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(11.25f)
                verticalLineTo(17f)
                horizontalLineTo(6.75f)
                curveTo(4.679f, 17f, 3f, 15.321f, 3f, 13.25f)
                verticalLineTo(5.915f)
                curveTo(2.417f, 5.709f, 2f, 5.153f, 2f, 4.5f)
                curveTo(2f, 3.672f, 2.672f, 3f, 3.5f, 3f)
                horizontalLineTo(12.022f)
                curveTo(11.459f, 3.878f, 11.102f, 4.901f, 11.019f, 6f)
                horizontalLineTo(4.5f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 14.493f, 5.507f, 15.5f, 6.75f, 15.5f)
                horizontalLineTo(17.25f)
                curveTo(18.493f, 15.5f, 19.5f, 14.493f, 19.5f, 13.25f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ProjectionScreenDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ProjectionScreenDismiss, contentDescription = null)
    }
}
