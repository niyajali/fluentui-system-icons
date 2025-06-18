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

public val FluentUi.Regular.CheckmarkLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CheckmarkLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
            curveTo(22f, 12.427f, 21.973f, 12.847f, 21.921f, 13.259f)
            curveTo(21.728f, 12.361f, 21.19f, 11.591f, 20.452f, 11.095f)
            curveTo(20f, 6.826f, 16.389f, 3.5f, 12f, 3.5f)
            curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
            curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
            curveTo(12.338f, 20.5f, 12.672f, 20.48f, 13f, 20.442f)
            verticalLineTo(21.5f)
            curveTo(13f, 21.652f, 13.014f, 21.802f, 13.04f, 21.947f)
            curveTo(12.698f, 21.982f, 12.351f, 22f, 12f, 22f)
            curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            close()
            moveTo(20.487f, 12.482f)
            curveTo(20.03f, 11.885f, 19.31f, 11.5f, 18.5f, 11.5f)
            curveTo(17.119f, 11.5f, 16f, 12.619f, 16f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(15.5f)
            curveTo(14.672f, 15f, 14f, 15.672f, 14f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(14f, 21.601f, 14.01f, 21.699f, 14.029f, 21.794f)
            curveTo(14.165f, 22.482f, 14.772f, 23f, 15.5f, 23f)
            horizontalLineTo(21.5f)
            curveTo(22.328f, 23f, 23f, 22.328f, 23f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(23f, 15.686f, 22.351f, 15.023f, 21.542f, 15.001f)
            curveTo(21.528f, 15f, 21.514f, 15f, 21.5f, 15f)
            horizontalLineTo(21f)
            verticalLineTo(14f)
            curveTo(21f, 13.429f, 20.809f, 12.903f, 20.487f, 12.482f)
            close()
            moveTo(18.107f, 19.92f)
            curveTo(17.75f, 19.767f, 17.5f, 19.413f, 17.5f, 19f)
            curveTo(17.5f, 18.448f, 17.948f, 18f, 18.5f, 18f)
            curveTo(18.939f, 18f, 19.311f, 18.282f, 19.446f, 18.675f)
            curveTo(19.481f, 18.777f, 19.5f, 18.886f, 19.5f, 19f)
            curveTo(19.5f, 19.552f, 19.052f, 20f, 18.5f, 20f)
            curveTo(18.36f, 20f, 18.227f, 19.971f, 18.107f, 19.92f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.5f, 13.448f, 17.948f, 13f, 18.5f, 13f)
            curveTo(19.052f, 13f, 19.5f, 13.448f, 19.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(17.5f)
            verticalLineTo(14f)
            close()
            moveTo(10.75f, 13.439f)
            lineTo(15.22f, 8.97f)
            curveTo(15.513f, 8.677f, 15.987f, 8.677f, 16.28f, 8.97f)
            curveTo(16.547f, 9.236f, 16.571f, 9.653f, 16.353f, 9.946f)
            lineTo(16.28f, 10.03f)
            lineTo(11.28f, 15.03f)
            curveTo(11.014f, 15.297f, 10.597f, 15.321f, 10.304f, 15.103f)
            lineTo(10.22f, 15.03f)
            lineTo(7.72f, 12.53f)
            curveTo(7.427f, 12.237f, 7.427f, 11.763f, 7.72f, 11.47f)
            curveTo(7.986f, 11.203f, 8.403f, 11.179f, 8.696f, 11.397f)
            lineTo(8.78f, 11.47f)
            lineTo(10.75f, 13.439f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CheckmarkLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CheckmarkLock, contentDescription = null)
    }
}
