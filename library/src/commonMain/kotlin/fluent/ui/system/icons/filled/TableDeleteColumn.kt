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

public val FluentIcons.Filled.TableDeleteColumn: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableDeleteColumn",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 3.75f)
            verticalLineTo(8f)
            lineTo(17f, 8f)
            verticalLineTo(6.25f)
            curveTo(17f, 4.455f, 18.455f, 3f, 20.25f, 3f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 3f, 22f, 3.336f, 22f, 3.75f)
            close()
            moveTo(22f, 9.5f)
            verticalLineTo(14.5f)
            lineTo(17f, 14.5f)
            verticalLineTo(9.5f)
            lineTo(22f, 9.5f)
            close()
            moveTo(21.25f, 21f)
            curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
            verticalLineTo(16f)
            lineTo(17f, 16f)
            verticalLineTo(17.75f)
            curveTo(17f, 19.545f, 18.455f, 21f, 20.25f, 21f)
            horizontalLineTo(21.25f)
            close()
            moveTo(2f, 20.25f)
            curveTo(2f, 20.664f, 2.336f, 21f, 2.75f, 21f)
            horizontalLineTo(3.75f)
            curveTo(5.545f, 21f, 7f, 19.545f, 7f, 17.75f)
            verticalLineTo(16f)
            lineTo(2f, 16f)
            lineTo(2f, 20.25f)
            close()
            moveTo(2f, 9.5f)
            lineTo(2f, 14.5f)
            lineTo(7f, 14.5f)
            lineTo(7f, 9.5f)
            lineTo(2f, 9.5f)
            close()
            moveTo(2f, 3.75f)
            lineTo(2f, 8f)
            lineTo(7f, 8f)
            verticalLineTo(6.25f)
            curveTo(7f, 4.455f, 5.545f, 3f, 3.75f, 3f)
            lineTo(2.75f, 3f)
            curveTo(2.336f, 3f, 2f, 3.336f, 2f, 3.75f)
            close()
            moveTo(11.25f, 15.523f)
            verticalLineTo(21.25f)
            curveTo(11.25f, 21.664f, 11.586f, 22f, 12f, 22f)
            curveTo(12.414f, 22f, 12.75f, 21.664f, 12.75f, 21.25f)
            verticalLineTo(15.523f)
            curveTo(12.724f, 15.5f, 12.699f, 15.476f, 12.674f, 15.451f)
            lineTo(12f, 14.777f)
            lineTo(11.326f, 15.451f)
            curveTo(11.301f, 15.476f, 11.276f, 15.5f, 11.25f, 15.523f)
            close()
            moveTo(11.25f, 8.727f)
            curveTo(11.276f, 8.75f, 11.301f, 8.774f, 11.326f, 8.799f)
            lineTo(12f, 9.473f)
            lineTo(12.674f, 8.799f)
            curveTo(12.699f, 8.774f, 12.724f, 8.75f, 12.75f, 8.727f)
            verticalLineTo(2.75f)
            curveTo(12.75f, 2.336f, 12.414f, 2f, 12f, 2f)
            curveTo(11.586f, 2f, 11.25f, 2.336f, 11.25f, 2.75f)
            lineTo(11.25f, 8.727f)
            close()
            moveTo(9.47f, 14.53f)
            curveTo(9.177f, 14.237f, 9.177f, 13.763f, 9.47f, 13.47f)
            lineTo(10.939f, 12f)
            lineTo(9.47f, 10.53f)
            curveTo(9.177f, 10.237f, 9.177f, 9.763f, 9.47f, 9.47f)
            curveTo(9.763f, 9.177f, 10.237f, 9.177f, 10.53f, 9.47f)
            lineTo(12f, 10.939f)
            lineTo(13.47f, 9.47f)
            curveTo(13.763f, 9.177f, 14.237f, 9.177f, 14.53f, 9.47f)
            curveTo(14.823f, 9.763f, 14.823f, 10.237f, 14.53f, 10.53f)
            lineTo(13.061f, 12f)
            lineTo(14.53f, 13.47f)
            curveTo(14.823f, 13.763f, 14.823f, 14.237f, 14.53f, 14.53f)
            curveTo(14.237f, 14.823f, 13.763f, 14.823f, 13.47f, 14.53f)
            lineTo(12f, 13.061f)
            lineTo(10.53f, 14.53f)
            curveTo(10.237f, 14.823f, 9.763f, 14.823f, 9.47f, 14.53f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableDeleteColumnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableDeleteColumn, contentDescription = null)
    }
}
