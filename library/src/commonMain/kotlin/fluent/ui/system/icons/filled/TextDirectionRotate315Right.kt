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

public val FluentIcons.Filled.TextDirectionRotate315Right: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextDirectionRotate315Right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.5f, 2f)
                curveTo(10.948f, 2f, 10.5f, 2.448f, 10.5f, 3f)
                curveTo(10.5f, 3.552f, 10.948f, 4f, 11.5f, 4f)
                horizontalLineTo(11.586f)
                lineTo(8.543f, 7.043f)
                curveTo(8.152f, 7.433f, 8.152f, 8.067f, 8.543f, 8.457f)
                curveTo(8.933f, 8.848f, 9.567f, 8.848f, 9.957f, 8.457f)
                lineTo(13f, 5.414f)
                verticalLineTo(5.5f)
                curveTo(13f, 6.052f, 13.448f, 6.5f, 14f, 6.5f)
                curveTo(14.552f, 6.5f, 15f, 6.052f, 15f, 5.5f)
                verticalLineTo(3f)
                curveTo(15f, 2.448f, 14.552f, 2f, 14f, 2f)
                horizontalLineTo(11.5f)
                close()
                moveTo(3.428f, 7.596f)
                curveTo(3.046f, 7.415f, 2.592f, 7.494f, 2.293f, 7.793f)
                curveTo(1.994f, 8.092f, 1.915f, 8.546f, 2.096f, 8.928f)
                lineTo(6.596f, 18.428f)
                curveTo(6.833f, 18.927f, 7.429f, 19.14f, 7.928f, 18.904f)
                curveTo(8.427f, 18.667f, 8.64f, 18.071f, 8.404f, 17.572f)
                lineTo(7.259f, 15.155f)
                lineTo(9.655f, 12.759f)
                lineTo(12.072f, 13.904f)
                curveTo(12.571f, 14.14f, 13.167f, 13.927f, 13.404f, 13.428f)
                curveTo(13.64f, 12.929f, 13.427f, 12.333f, 12.928f, 12.096f)
                lineTo(3.428f, 7.596f)
                close()
                moveTo(7.736f, 11.85f)
                lineTo(6.35f, 13.236f)
                lineTo(5.102f, 10.602f)
                lineTo(7.736f, 11.85f)
                close()
                moveTo(18.5f, 9f)
                curveTo(17.948f, 9f, 17.5f, 9.448f, 17.5f, 10f)
                curveTo(17.5f, 10.552f, 17.948f, 11f, 18.5f, 11f)
                horizontalLineTo(18.586f)
                lineTo(9.293f, 20.293f)
                curveTo(8.902f, 20.683f, 8.902f, 21.317f, 9.293f, 21.707f)
                curveTo(9.683f, 22.098f, 10.317f, 22.098f, 10.707f, 21.707f)
                lineTo(20f, 12.414f)
                verticalLineTo(12.5f)
                curveTo(20f, 13.052f, 20.448f, 13.5f, 21f, 13.5f)
                curveTo(21.552f, 13.5f, 22f, 13.052f, 22f, 12.5f)
                verticalLineTo(10f)
                curveTo(22f, 9.448f, 21.552f, 9f, 21f, 9f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextDirectionRotate315RightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextDirectionRotate315Right, contentDescription = null)
    }
}
