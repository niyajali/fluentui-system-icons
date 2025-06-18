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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ClockLock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockLock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.25f, 13.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 13.5f, 10.5f, 13.164f, 10.5f, 12.75f)
            verticalLineTo(6.75f)
            curveTo(10.5f, 6.336f, 10.836f, 6f, 11.25f, 6f)
            curveTo(11.664f, 6f, 12f, 6.336f, 12f, 6.75f)
            verticalLineTo(12f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 12f, 16f, 12.336f, 16f, 12.75f)
            curveTo(16f, 13.164f, 15.664f, 13.5f, 15.25f, 13.5f)
            close()
            moveTo(12f, 2f)
            curveTo(6.478f, 2f, 2f, 6.478f, 2f, 12f)
            curveTo(2f, 12.427f, 2.027f, 12.847f, 2.079f, 13.259f)
            curveTo(2.418f, 11.682f, 3.821f, 10.5f, 5.5f, 10.5f)
            curveTo(7.433f, 10.5f, 9f, 12.067f, 9f, 14f)
            verticalLineTo(14.05f)
            curveTo(10.141f, 14.282f, 11f, 15.29f, 11f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(11f, 21.652f, 10.986f, 21.802f, 10.96f, 21.947f)
            curveTo(11.302f, 21.982f, 11.649f, 22f, 12f, 22f)
            curveTo(17.522f, 22f, 22f, 17.522f, 22f, 12f)
            curveTo(22f, 6.478f, 17.522f, 2f, 12f, 2f)
            close()
            moveTo(3f, 15f)
            verticalLineTo(14f)
            curveTo(3f, 12.619f, 4.119f, 11.5f, 5.5f, 11.5f)
            curveTo(6.881f, 11.5f, 8f, 12.619f, 8f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(8.5f)
            curveTo(9.328f, 15f, 10f, 15.672f, 10f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(10f, 22.328f, 9.328f, 23f, 8.5f, 23f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 23f, 1f, 22.328f, 1f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(1f, 15.672f, 1.672f, 15f, 2.5f, 15f)
            horizontalLineTo(3f)
            close()
            moveTo(4.5f, 14f)
            verticalLineTo(15f)
            horizontalLineTo(6.5f)
            verticalLineTo(14f)
            curveTo(6.5f, 13.448f, 6.052f, 13f, 5.5f, 13f)
            curveTo(4.948f, 13f, 4.5f, 13.448f, 4.5f, 14f)
            close()
            moveTo(6.5f, 19f)
            curveTo(6.5f, 18.448f, 6.052f, 18f, 5.5f, 18f)
            curveTo(4.948f, 18f, 4.5f, 18.448f, 4.5f, 19f)
            curveTo(4.5f, 19.552f, 4.948f, 20f, 5.5f, 20f)
            curveTo(6.052f, 20f, 6.5f, 19.552f, 6.5f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClockLock, contentDescription = null)
    }
}
